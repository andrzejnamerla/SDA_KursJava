package PodstawyJavaAlgorytmy.NumerDowodu;

import java.util.Scanner;

/**
 * Created by RENT on 2017-08-02.
 */
public class DowodOsobisty {

    public static void main(String[] args) {
        boolean poprawnyNumer = false;
        String dowod;// = "ABC123456";

        //while (poprawnyNumer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj serie i numer dowodu osobistego: ");
        dowod = scanner.next();
            /*if (dowod.length()==10){
                poprawnyNumer=true;
            } else {
                System.out.println("Nie poprawna seria i numer dowodu. \n");
            }

        }*/
        int[] tabDowod = new int[9];
        int[] test = new int[]{7,1,3,7,1,3,7,3};
        int[] wynDowod = new int[9];
        int suma = 0;

        for (int i = 0; i < 8; i++) {
            if (i < 3) {
                tabDowod[i] = (int) dowod.charAt(i) - 55;
            } else {
                tabDowod[i] = (int) dowod.charAt(i) - 48;
            }
        }

        for (int i = 0; i < 8; i++) {
            if (i == 3) {
            } else {
                wynDowod[i] = tabDowod[i] * test[i];
                suma += wynDowod[i];
            }
        }

        System.out.println(Math.floorMod(suma, 10));

    }
}
