package ProgObiektowe.excepions;

/**
 * Created by RENT on 2017-07-25.
 */
public class PrzechwytywanieBledu {
    public static void main(String[] args){
        int a=5;
        int b=0;
        int wynik;

        try{
            wynik=a/b;
            System.out.println(wynik);
        } catch (Exception ex){
            System.out.println("Nie mozesz dzielic przez zero");
        }

    }
}
