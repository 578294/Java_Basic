package ru.otus.hw4;

public class QandA {
    private final String question;
    private final String[] answerOption;
    private final Integer correctAnswer;
    protected QandA (String questions, String[] answerOption, Integer correctAnswer) {
        this.question = questions;
        this.answerOption = answerOption;
        this.correctAnswer = correctAnswer;

    }
    public int getCorrectAnswer() {
        return correctAnswer;
    }
    public String getQuestion() {
        return question;
    }
    public String[] getAnswerOptions() {
        return answerOption;
    }
    public Integer lengthAnswerOptions() {
        return answerOption.length;
    }

}
