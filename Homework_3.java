package test.array.scanner;

import java.util.Scanner;
public class Homework3 {
    public static void main(String[] args) {
        // Переменные для хранения количества правильных и неправильных ответов
        int correctCount = 0, wrongCount = 0;

        // Массив вопросов
        String[] questions = {"Назовите кратное число"};

        // Массив вариантов ответов
        String[] answerOptions = new String[3];
        answerOptions[0] = "14";
        answerOptions[1] = "23";
        answerOptions[2] = "45";

        // Массив правильных ответов
        int[] correctAnswers = new int[3]; //задаю варианты ответов
        correctAnswers[0] = 1;
        correctAnswers[1] = 2;
        correctAnswers[2] = 3;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {

            //Вывод вопроса на экран
            System.out.println(questions[i]);
            //Вывод вариантов ответа
            System.out.println(i + 1+ " " + answerOptions);
            //
            System.out.print("Ваш ответ: ");
            int result = scanner.nextInt();
            System.out.println();
            if (scanner.hasNextInt()) {
                int res = scanner.nextInt();
                System.out.println(correctAnswers[0]);
            } else {
                System.out.println("Неправильно ");
            }
        }
        //Выводим общий результат
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}