package ProgObiektowe.KontoBankowe;


/**
 * Created by RENT on 2017-07-25.
 */
public class BankMain {
    public static void main(String[] args) {


        KontoOszczednosciowe mojeKonto = new KontoOszczednosciowe(4000);
        try {
            System.out.println(mojeKonto.Wyplata(500));
        } catch (Exception e) {
            System.out.println("Wystapil blad: " + e.getMessage());
        }


    }
}
