package ProgObiektowe.inheritance.inheritanceClass;

/**
 * Created by RENT on 2017-07-24.
 */
public class StudentZaoczny extends Student implements Pracujacy {

    public StudentZaoczny(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek);
    }

    public StudentZaoczny(String imie, String nazwisko, int wiek, int index, String kierunek, String uczenia) {
        super(imie, nazwisko, wiek, index, kierunek, uczenia);
    }

    //implementacja interfejsu Pracujacy

    @Override
    public double getPensja() {
        return 0;
    }

    @Override
    public void pracuj() {

    }
}
