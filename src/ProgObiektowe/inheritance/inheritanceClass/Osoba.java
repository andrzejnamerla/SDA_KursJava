package ProgObiektowe.inheritance.inheritanceClass;

/**
 * Created by RENT on 2017-07-20.
 */
public class Osoba {
    private String imie;
    private String nazwisko;
    private int wiek;
    private int pesel;

    public Osoba(){

    }

    public Osoba(String imie, String nazwisko, int wiek){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    //nadpisywanie metody z glownego pliku java metode String
    @Override
    public String toString(){
        return "Jestem osoba i nazywam sie: " + imie + " " + nazwisko;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            return true;
        }
        boolean czyRowne = false;
        if (obj instanceof Osoba){
            Osoba drugaOsoba = (Osoba) obj;
            czyRowne = this.pesel == drugaOsoba.pesel;

        }
        return czyRowne;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
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
