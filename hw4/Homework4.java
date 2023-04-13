package ru.otus.hw4;

import java.util.ArrayList;
import java.util.Scanner;
public class Homework4 {
    public static void main(String[] args) {
        // Переменные для хранения количества правильных и неправильных ответов
        //  int correctCount = 0, wrongCount = 0;
        //  int correctAnswers[0] = 1;
        //  int correctAnswers[1] = 2;
        //  int correctAnswers[2] = 3;

        Count correctCount = new Count(0);
        Count wrongCount = new Count(0);

        QandA questionOne = new QandA(
                "Назовите кратное число",
                new String[]{"1. 14", "2. 15", "3. 13", "4. 11"},
                1);
        QandA questionTwo = new QandA(
                "Назовите столицу Франции",
                new String[]{"1. Берлин", "2. Париж", "3. Мадрид"},
                2);
        QandA questionThree = new QandA(
                "Назовите столицу Испании",
                new String[]{"1. Берлин", "2. Париж", "3. Мадрид", "4. Барселона"},
                3);
        ArrayList<QandA> questionsArr = new ArrayList<>();
        questionsArr.add(questionOne);
        questionsArr.add(questionTwo);
        questionsArr.add(questionThree);

        for (int i = 0; i < questionsArr.size(); i++) {
            QandA tempCurrentQuestion = questionsArr.get(i);
            System.out.println("Вопрос №"+(i+1)+": "+tempCurrentQuestion.getQuestion());
            for (int j = 0; j < tempCurrentQuestion.getAnswerOptions().length; j++) {
                System.out.println("Вариант ответа " + " : " + tempCurrentQuestion.getAnswerOptions()[j]);
            }

            System.out.print("Ваш ответ: ");
            Scanner scanner = new Scanner(System.in);

            while (true) {
                Integer answerOption = scanner.nextInt();
                if (answerOption <= (tempCurrentQuestion.lengthAnswerOptions()) && answerOption > 0) {
                    if (answerOption.equals(tempCurrentQuestion.getCorrectAnswer())) {
                        System.out.println("Великолепно! Это правильный ответ");
                        correctCount.plusCount();
                    } else {
                        System.out.println("Неверно! Правильный ответ: " + tempCurrentQuestion.getCorrectAnswer());
                        wrongCount.plusCount();
                    }
                    break;
                } else {
                   // System.out.println("Вы ошиблись при вводе, попробуйте еще раз");
                    System.out.print("Ваш ответ: ");
                }
            }
            System.out.println("------------------");
        }
        System.out.println("Результат: правильно " + correctCount.getCount() + ", неправильно " + wrongCount.getCount());
    }
}
