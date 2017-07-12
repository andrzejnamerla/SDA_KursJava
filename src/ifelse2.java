import java.util.Scanner;

/**
 * Created by RENT on 2017-07-05.
 */
public class ifelse2 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe od 1 do 3");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();

        if (liczba == 1){
            System.out.println("Podales jeden");
        }
        else if (liczba == 2) {
            System.out.println("Podales dwa");
        }
        else if (liczba == 3) {
            System.out.println("Podales trzy");
        }
        else {
            System.out.println("Podales niewlasciwa licze");
        }
    }
}
