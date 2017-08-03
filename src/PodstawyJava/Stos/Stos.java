package PodstawyJava.Stos;

/**
 * Created by RENT on 2017-08-03.
 */
public class Stos {

    private int[] wektor;
    private int licznik = 0;

    public Stos(int rozzmiar) {
        this.wektor = new int[rozzmiar];
    }

    public void pusch(int el){
        this.wektor[this.licznik]=el;
        this.licznik++;
    }


}



