--Homework_9

--создаем таблицу test_questions
create table test_questions
( 
	id	serial	primary key,
	short_name	varchar(100)	not null unique,
	description	varchar(100)
);

--создаем таблицу test_answers
create table test_answers
( 
	id	serial	primary key,
	answers	varchar(100)	not null unique
);

--заполним таблицу test_questions
insert into test_questions(id, short_name, description)
values 
	(1, 'number', 'Назовите кратное число'),
	(2, 'capital_france', 'Назовите столицу Франции'),
	(3, 'capital_spain', 'Назовите столицу Испании');
	
select * from test_questions	

--заполним таблицу test_answers
insert into test_answers(id, answers)
values 
	(1, 14),
	(2, 'Париж'),
	(3, 'Мадрид');

select tq.id as "номер вопроса", tq.description as "Вопрос", ta.answers as "Ответ" 
from test_questions tq, test_answers ta
where tq.id=ta.id;	
	 