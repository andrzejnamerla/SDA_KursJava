package Podstawy;

/**
 * Created by RENT on 2017-07-04.
 */
public class Porownania {
    public static void main(String[] args) {

        int a = 15;
        int b = 10;

        boolean c = a==b;
        boolean d = a!=b;
        boolean e = a>b;
        boolean f = a<b;
        System.out.println("\nWyniki porownan dla " + a + " i " + b + ":");
        System.out.println("Rownosc \t" + c);
        System.out.println("Roznosc \t" + d);
        System.out.println("Wieksze \t" + e);
        System.out.println("Mniejsze \t" + f);

        //duplikacja danej lini jak jestesmy na niej ctrl + d

        System.out.println();

        System.out.println(false||false);
        System.out.println(true||false);
        System.out.println(false||true);
        System.out.println(true||true);

        System.out.println();

        System.out.println(false&&false);
        System.out.println(!false&&false);      //t&&f zrobione za pomoca negacji
        System.out.println(false&&!false);      //f&&t zrobione za pomoca negacji
        System.out.println(!false&&!false);     //t&&t zrobione za pomoca negacji
    }
}
