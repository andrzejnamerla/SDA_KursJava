package ProgObiektowe.overloading;


/**
 * Created by RENT on 2017-07-19.
 */
public class MathHelper {

    //metoda o sygnaturze aadNumbers(int, int)
    public int addNumbers(int a, int b) {
        return a + b;
    }

    //metoda o sygnaturze aadNumbers(double, double)
    public double addNumbers(double a, double b) {
        return a + b;
    }

    //metoda o sygnaturze aadNumbers(float, float)
    public float addNumbers(float a, float b) {
        return a + b;
    }
    //Wszystkie tzry metody maja inne sygnatury, wiec mozemy je przeciazac
    //UWAGA! Typ zwracany nie nalezy do definicji sygnatury
}
