package ProgObiektowe.inheritance;

import ProgObiektowe.inheritance.inheritanceClass.Osoba;
import ProgObiektowe.inheritance.inheritanceClass.Pracownik;
import ProgObiektowe.inheritance.inheritanceClass.Student;

/**
 * Created by RENT on 2017-07-20.
 */
public class inheritanceMain {
    public static void main(String[] args) {

        Osoba osoba = new Osoba("A", "N", 30);

        Student stPrawa = new Student("N", "A", 30, 100, "Prawo", "UAM");

        Pracownik ksiegowy = new Pracownik("X", "Y", 40);

        osoba.opiszOsobe();
        stPrawa.opiszStudenta();
        ksiegowy.opiszOsobe();
        ksiegowy.getPensja();
    }
}
