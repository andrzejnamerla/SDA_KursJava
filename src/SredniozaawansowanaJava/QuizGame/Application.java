package SredniozaawansowanaJava.QuizGame;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static final String PATH_TO_RESULTS = "C:\\Users\\RENT\\Documents\\ASN\\src\\SredniozaawansowanaJava\\QuizGame\\wyniki.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcja;
        boolean exit = true;

        while (exit) {
            System.out.println("\nQuizie: ");
            System.out.println("1. Rozpocznnij nowy QuizGame \n2. Podaj wyniki \n0. Wyjscie");
            opcja = scanner.nextInt();
            List<Player> playerList = new ArrayList<>();
            int playerNumber = 0;

            switch (opcja) {
                case 1: {
                    System.out.println("Nowy QuizGame");
                    List<Question> questionList = Quiz.readAllQuestions();
                    List<Boolean> wynik = new ArrayList<>();
                    int punktacja = 0;
                    System.out.println("Podaj swoj nick: ");
                    Player nick = new Player();
                    nick.setNick(scanner.next());
                    playerList.add(nick);

                    for (int i = 0; i < questionList.size(); i++) {
                        System.out.println("\nPytanie nr " + i + " z " + questionList.size());
                        System.out.println(questionList.get(i).getTitle());
                        for (String pytania : questionList.get(i).getAnswers()) {
                            System.out.println(pytania);
                        }
                        wynik.add(questionList.get(i).getCorrectAnswer().equals(scanner.next()));
                        playerList.get(playerNumber).getAnswers().add(wynik.get(i));
                        if (wynik.get(i)) {
                            punktacja++;
                            System.out.println("Odpowiedz poprawna.");
                        } else {
                            System.out.println("Odpowiedz nie poprawna.");
                        }
                    }

                    playerList.get(playerNumber).setResult(punktacja);
                    System.out.println("Wynik: " + punktacja);
                    playerNumber++;

                    try {
                        List<String> list = new ArrayList<>();
                        playerList.forEach(pl -> list.add(pl.toString()));
                        Files.write(Paths.get(PATH_TO_RESULTS), list, Files.exists(Paths.get(PATH_TO_RESULTS)) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

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
