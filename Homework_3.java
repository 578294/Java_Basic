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
		String[][] answerOptions = {
				{"1. 14", "2. 15", "3. 13"},
				{"1. Берлин", "2. Париж", "3. Мадрид"},
				{"1. Берлин", "2. Париж", "3. Мадрид"}
		};

		// Массив правильных ответов
		int[] correctAnswers = {1, 2, 3}; //задаю варианты ответов

		Scanner scanner = new Scanner(System.in);
		// Цикл по всем вопросам
		for (int i = 0; i < 3; i++) {
			System.out.println(questions[i]);
			for (int j = 0; j < 2; j++) {
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