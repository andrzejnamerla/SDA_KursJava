package ProgObiektowe.PodstawyOOP;

/**
 * Created by RENT on 2017-07-13.
 */
public class PracownikMain {
    public static void main(String[] args) {
        //String imie = "Piotr";

        Pracownik prezes = new Pracownik();
        Pracownik dyrekor = new Pracownik();

        prezes.imie = "Jan";
        prezes.nazwisko = "Kowalski";
        //prezes.pensja = 1000; nie moge sie odniesc do tego parametru, poniewaz w klasie Pracownik pensja ma ustawione private
        prezes.wiek = 45;

        dyrekor.imie = "John";
        dyrekor.nazwisko = "Do";
        //dyrekor.pensja = 500; nie moge sie odniesc do tego parametru, poniewaz w klasie Pracownik pensja ma ustawione private
        dyrekor.wiek = 40;

        System.out.println("\nOpis pracownika (z klasy): ");
        prezes.Opis();

        System.out.println("\nPrezes \nImie: " + prezes.imie + "\nNazwisko: " + prezes.nazwisko);

        System.out.println("\nDane dyrektora (odwolanie do metody w klasie): ");
        dyrekor.OpiszPracownika();

        System.out.println("\nDane prezesa (odwolanie do metody w klasie): ");
        prezes.OpiszPracownika();
    }
}
