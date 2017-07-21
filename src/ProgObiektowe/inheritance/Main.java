package ProgObiektowe.inheritance;

import ProgObiektowe.inheritance.inheritanceClass.*;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by RENT on 2017-07-20.
 */
public class Main {
    public static void main(String[] args) {

        Osoba osoba = new Osoba("A", "N", 30);

        Student stPrawa = new Student("N", "A", 30, 100, "Prawo", "UAM");

        Pracownik ksiegowy = new Pracownik("X", "Y", 40);

        osoba.opiszOsobe();
        stPrawa.opiszStudenta();
        ksiegowy.opiszOsobe();
        ksiegowy.getPensja();

        //Override metody toString
        System.out.println("\n");
        System.out.println(osoba);

        System.out.println("\nPorownanie dwoch osob na podstawie peselu \nz uzyciem nadpisania komendy equals, \nzeby porownywala tylko pesel:\n");

        Osoba os1 = new Osoba();
        os1.setPesel(1234);

        Osoba os2 = new Osoba();
        os2.setPesel(1234);

        //Override metody equals
        if (os1.equals(os2)) {
            System.out.println("Ta sama osoba");
        } else {
            System.out.println("Nie ta sama osoba");
        }

        System.out.println("Zadania na Punktach 2D i 3D");
        //zadania z klasami punkt2D i punkt3D
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Punkt2D punkt2D = new Punkt2D();

        Punkt3D punkt3D = new Punkt3D(random.nextDouble(),random.nextDouble(),random.nextDouble());

        punkt2D.opiszPunkt();
        punkt3D.opiszPunkt();

    }
}
