package PodstawyJava.Kolejka;

public class Kolejka {

    private int[] wektor;
    private int poczatek;
    private int koniec;
    private int wielkosc;
    boolean flaga = true;

    public Kolejka(int rozmiar){

        wektor = new int[rozmiar];
        poczatek=0;
        koniec=0;
        wielkosc=rozmiar;
    }

    public void dodaj(int liczba){
        //warunek zawijania
        if(koniec>=wektor.length&&poczatek!=0){
            koniec=0;
            flaga = false;
        } if (koniec!=poczatek||flaga) {
            wektor[koniec] = liczba;
            koniec++;
        }
    }

    //Dokonczyc prace przy zawijaniu uzupelniajac oddawanie

    public int oddaj(){
        if (poczatek>=wektor.length){
            poczatek=0;
        }
        int temp = wektor[poczatek];
        poczatek++;
        return temp;
    }



}
