package SredniozaawansowanaJava.QuizGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcja;
        boolean exit = true;

        while (exit) {
            System.out.println("\nQuizie: ");
            System.out.println("1. Rozpocznnij nowy QuizGame \n2. Podaj wyniki \n0. Wyjscie");
            opcja = scanner.nextInt();
            switch (opcja) {
                case 1: {
                    System.out.println("Nowy QuizGame");
                    Quiz quiz = new Quiz();
                    List<Question> questionList = Quiz.readAllQuestions();
                    List<Boolean> wynik = new ArrayList<>();
                    int punktacja = 0;
                    for (int i = 0; i < questionList.size(); i++) {
                        System.out.println("\n" + questionList.get(i).getTitle());
                        for (String pytania : questionList.get(i).getAnswers()) {
                            System.out.println(pytania);
                        }
                        wynik.add(questionList.get(i).getAnswers().equals(scanner.next()));
                        if (wynik.get(i)){
                            punktacja ++;
                        }
                    }
                    System.out.println("Wynik: " + punktacja);

                    break;
                }
                case 2: {
                    System.out.println("Wyniki: ");
                    List<String> ranking = Quiz.getRanking();
                    if (ranking != null) {
                        for (String wynik : ranking) {
                            System.out.println(wynik);
                        }
                    } else {
                        System.out.println("Brak wynikow do wyswietlenia.");
                    }
                    break;
                }
                case 0: {
                    exit = false;
                    System.out.println("Do widzenia :-)");
                    break;
                }
                default: {
                    System.out.println("Nie prawidlowy wybor. Sproboj jeszcze raz.");
                }
            }
        }
    }

}
