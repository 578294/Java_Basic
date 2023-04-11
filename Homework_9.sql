--Homework_9

drop table test_question;
drop table test_answer;
drop table question_to_answer;

--создаем таблицу test_question
create table test_question
( 
	id_question	serial	primary key,
	full_question	varchar(100),
	correct_answer	varchar(100)	not null unique
);

--создаем таблицу test_answer
create table test_answer
( 
	id_answer	serial	primary key,
	answer	varchar(100)	not null unique
);

--создаем таблицу question_to_answer
create table question_to_answer
( 
	id_question	serial,
	id_answer	serial	
);


--заполним таблицу test_questions
insert into test_question(id_question, full_question, correct_answer)
values 
	(1, 'Назовите кратное число', 14),
	(2, 'Назовите столицу Франции','Париж'),
	(3, 'Назовите столицу Испании','Мадрид');
	

--заполним таблицу test_answers
insert into test_answer(id_answer, answer)
values 
	(1, 14),
	(2, 'Париж'),
	(3, 'Мадрид'),
	(4, '11'),
	(5, 'Лондон'),
	(6, 'Москва');


--заполним таблицу question_to_answer
insert into question_to_answer(id_question, id_answer)
values 
	(1, 1),
	(2, 2),
	(3, 3);
	

select row_number() over(ORDER BY qa.id_answer desc) num, qa.id_answer, tq.full_question, ta.answer
from test_question tq, question_to_answer qa, test_answer ta
where tq.id_question=qa.id_question
and qa.id_answer = ta.id_answer;
	 