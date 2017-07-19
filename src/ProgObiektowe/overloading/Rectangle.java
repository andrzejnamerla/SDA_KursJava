package ProgObiektowe.overloading;

/**
 * Created by RENT on 2017-07-19.
 */
public class Rectangle {

    private double a;
    private double b;

    public Rectangle(){
        //1
        this.a = 0;
        this.b = 0;
    }

    public Rectangle(int a){
        //2
        this();
        this.a = a;
    }

    public Rectangle(int a, int b){
        //3
        this(a);
        this.b = b;
    }
    //Kolejnosc wywolywania konstruktorow z odwolaniami pomiedzy nimi: 3 >> 2 >> 1 >> 1 >> 2 >> 3

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }
}
