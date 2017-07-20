package ProgObiektowe.inheritance.inheritanceClass;

/**
 * Created by RENT on 2017-07-20.
 */
public class Student extends Osoba {
    private int index;
    private String kierunek;
    private String uczenia;


    public Student(String imie, String nazwisko, int wiek){
        super(imie, nazwisko, wiek);
    }

    public Student(String imie, String nazwisko, int wiek, int index, String kierunek, String uczenia){
        this(imie, nazwisko, wiek);
        this.index = index;
        this.kierunek = kierunek;
        this.uczenia = uczenia;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getKierunek() {
        return kierunek;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    public String getUczenia() {
        return uczenia;
    }

    public void setUczenia(String uczenia) {
        this.uczenia = uczenia;
    }

    public void opiszStudenta(){
        System.out.println(this.getImie() +" "+this.getNazwisko()+" "+index);
    }

}
