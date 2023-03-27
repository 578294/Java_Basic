import java.util.Scanner;
public class Homework3 {
    public static void main(String[] args) {
        // Переменные для хранения количества правильных и неправильных ответов
        int correctCount = 0, wrongCount = 0;

        // Массив вопросов
        String[] questions = {"Назовите кратное число",
                              "Назовите столицу Франции",
                              "Назовите столицу Испании"};

        // Массив вариантов ответов
        String[][] answerOptions = new String [3][];
        answerOptions[0] = new String[]{"1. 14", "2. 15", "3. 13", "4. 11"};
        answerOptions[1] = new String[]{"1. Берлин", "2. Париж", "3. Мадрид"};
        answerOptions[2] = new String[]{"1. Берлин", "2. Париж", "3. Мадрид", "4. Барселона"};

        // Массив правильных ответов
        int[] correctAnswers = new int[3]; //задаю варианты ответов
        correctAnswers[0] = 1;
        correctAnswers[1] = 2;
        correctAnswers[2] = 3;

        Scanner scanner = new Scanner(System.in);
        // Цикл по всем вопросам
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < answerOptions[i].length; j++) {
                System.out.println(answerOptions[i][j]);
            }
            System.out.println("Ваш ответ: ");
            // Считываем с консоли ответ пользователя
            int answer = scanner.nextInt();

            // Проверяем и выводим результат
            if (answer == correctAnswers[i]) {
                System.out.println(answer);
                System.out.println("Верно!");
                correctCount = correctCount + 1;
            } else {
                System.out.println(answer);
                System.out.println("Не верно");
                wrongCount = wrongCount + 1;
            }
            System.out.println();
        }

        //Выводим общий результат
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}