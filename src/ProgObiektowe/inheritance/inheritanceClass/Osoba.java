package ProgObiektowe.inheritance.inheritanceClass;

/**
 * Created by RENT on 2017-07-20.
 */
public class Osoba {
    private String imie;
    private String nazwisko;
    private int wiek;

    public Osoba(String imie, String nazwisko, int wiek){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public void opiszOsobe(){
        System.out.println("Nazywam sie " + imie + " " + nazwisko);
    }
}
