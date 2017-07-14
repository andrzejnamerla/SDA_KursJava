package ProgObiektowe.PodstawyOOP;

/**
 * Created by RENT on 2017-07-13.
 */
public class Pracownik {

    //Stara kalasa pracownik, zawiera pola publiczne

    /*zasada tworzenia klasy, metody:
    najpierw definiujemy obiekty (pola),
    pozniej konstruktory,
    pozniej reszta (metody)*/

    public String imie;

    public String nazwisko;

    public int wiek;

    //nie mozna sie odwolac do pola pensja poza ta klasa, poniewaz jest ustawiony private
    private float pensja;



    /*konstruktor to metoda, ktora nazywa sie tak samo jak klasa i jest tworzona przez kompilator przy tworzeniu programu,
    nie musimy jej tworzyc recznie, jest wywolywana poleceniem new z maina.
    mozemy w ciele konstruktora nadawac domyslne/pierwotne wartosci parametrow.
    dobra praktyka jest tworzenie konstruktora, nawet z pustym cialem*/
    public Pracownik(){
        //System.out.println("Jestesmy w konstruktorze");
        pensja = 2000;
    }


    //metoda klasy pracownik
    public void Opis(){
        System.out.println("Pracownik");
    }

    public void OpiszPracownika(){
        System.out.println("Imie: " + this.imie + "\nNazwisko: " + this.nazwisko); //slowo this odwoluje sie do obeiktu, ktory to wywolal
        System.out.println(pensja);
    }

    public void podwyzka(int procent){
        float kwota = (pensja * procent)/100;
        pensja+=kwota;
    }
}
