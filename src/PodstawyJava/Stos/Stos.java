package PodstawyJava.Stos;

/**
 * Created by RENT on 2017-08-03.
 */
public class Stos {

    private int[] wektor;
    private int licznik = 0;

    public Stos(int rozmiar) {
        this.wektor = new int[rozmiar];
    }

    public void pusch(int el){
        this.wektor[this.licznik]=el;
        this.licznik++;
    }

    public int pop(){
        if (licznik>=0){
            this.licznik--;
            return this.wektor[this.licznik];
        }else {
            return -1;

        }
    }


}



