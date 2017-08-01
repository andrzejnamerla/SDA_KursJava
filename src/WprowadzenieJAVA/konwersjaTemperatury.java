package WprowadzenieJAVA;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-05.
 */
public class konwersjaTemperatury {
    public static void main(String[] args) {
        System.out.println("\nKonwerter temperatury ze stopni Celcjusza do Fahrenheita");
        System.out.println("\nPodaj wartosc temperatury w stopniach Celcjusza (zatwiedz Enterem):");

        Scanner scanner = new Scanner(System.in);
        double celciusz = scanner.nextDouble(); //wywolac menu rozwijane ctrl + spacja

        double fahrenheita = 1.8 * celciusz + 32;
        // ewentualnie uzycie floata, czyli: float fahrenheita = 1.8f * celciusz +32;

        System.out.println("Wartosc w skali Fahrenheita: " + fahrenheita);

    }
}
