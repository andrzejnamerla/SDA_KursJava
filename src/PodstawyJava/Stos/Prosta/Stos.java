package PodstawyJava.Stos.Prosta;

/**
 * Created by RENT on 2017-08-03.
 */
public class Stos {

    private int[] wektor;
    private int licznik = 0;

    public Stos(int rozmiar) {
        this.wektor = new int[rozmiar];
    }

    public void push(int el){
        this.wektor[this.licznik]=el;
        this.licznik++;
    }

    public int pop(){

            this.licznik--;
            return this.wektor[this.licznik];

    }


}



