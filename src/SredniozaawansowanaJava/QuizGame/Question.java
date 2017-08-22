package SredniozaawansowanaJava.QuizGame;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private String title;
    private List<String> answers = new ArrayList<>();
    private String correctAnswer;

    public Question() {
    }

    public List<String> getAnswers() {
        return answers;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
