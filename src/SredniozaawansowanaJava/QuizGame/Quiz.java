package SredniozaawansowanaJava.QuizGame;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Quiz {

    private static final String PATH_TO_RESULTS = "wyniki.txt";
    public static final String PATH_TO_QUESTIONS = "C:\\Users\\RENT\\Documents\\ASN\\src\\SredniozaawansowanaJava\\QuizGame\\pytania.txt";

    public static List<String> getRanking() {

        //odczytac z pliku wynik.txt
        //zwrocic te wyniki

        List<String> result = null;

        try {
            result = Files.readAllLines(Paths.get(PATH_TO_RESULTS));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;

    }

    public static List<Question> readAllQuestions() {

        //odczytac wszystkie linie z pliku
        //zmapowac pytania na obiekt typu Question

        List<String> questionsFromFiles = null;
        List<Question> questionList = new ArrayList<>();

        try {
            questionsFromFiles = Files.readAllLines(Paths.get(PATH_TO_QUESTIONS));
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < questionsFromFiles.size(); i += 6) {
            Question question = new Question();
            question.setTitle(questionsFromFiles.get(i));
            question.getAnswers().add(questionsFromFiles.get(i + 1));
            question.getAnswers().add(questionsFromFiles.get(i + 2));
            question.getAnswers().add(questionsFromFiles.get(i + 3));
            question.getAnswers().add(questionsFromFiles.get(i + 4));
            question.setCorrectAnswer(questionsFromFiles.get(i + 5));
            questionList.add(question);
        }

        return questionList;
    }

}
