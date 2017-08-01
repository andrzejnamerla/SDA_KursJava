package WprowadzenieJAVA;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-05.
 */
public class kalkulatorSwitch {
    public static void main(String[] args) {
        System.out.println("\nKalkulator");
        Scanner scanner = new Scanner(System.in);
        float pierwsza;
        float druga;
        float wynik = 0;
        char operacja;

        System.out.println("\nPodaj pierwsza liczbe: ");
        pierwsza = scanner.nextFloat();
        System.out.println("Podaj druga liczbe: ");
        druga = scanner.nextFloat();
        System.out.println("Podaj znak dzialania (+ - * /) ");
        operacja = scanner.next().charAt(0);

        while(operacja != '+' || operacja != '-' || operacja != '*' || operacja != '/') { //equals() jest porownaniem dla Stringa
            System.out.println("\nNieprawidlowa operacja (" + operacja +")");
            System.out.println("Podaj znak dzialania (+ - * /) ");
            operacja = scanner.next().charAt(0);
        }

        switch (operacja) {
            case '+':
                wynik = pierwsza + druga;
                break;
            case '-':
                wynik = pierwsza - druga;
                break;
            case '*':
                wynik = pierwsza * druga;
                break;
            case '/': {
                if (druga == 0){
                    System.out.println("\nNie mozna dzielic przez zero.");
                } else {
                    wynik = pierwsza / druga;
                }
            }
                break;
            default:
                //System.out.println("\nNieprawidlowa operacja");
                break;
        }
        System.out.println("Wynik dzialania: " + wynik);
    }
}
