package ProgObiektowe.overloading;

/**
 * Created by RENT on 2017-07-19.
 */
public class MathHelperMain {
    public static void main(String[] args) {
        MathHelper mathHelper = new MathHelper();
        int wynik = mathHelper.addNumbers(2, 2);
        double wynik2 = mathHelper.addNumbers(2.0, 5.4);

        System.out.println(wynik + " " + wynik2);
    }
}
