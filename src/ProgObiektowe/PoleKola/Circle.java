package ProgObiektowe.PoleKola;


/**
 * Created by RENT on 2017-07-14.
 */
public class Circle {
    //pole
    private double promien;

    //skrot do szybszego tworzenia pobierz i ustaw dla pola prytwatnego Alt + Insert (Getter i Setter)

    //konstruktor
    public Circle(){
        promien = 0;
    }

    //metoda, zwrocenie wartosci pomimo parametru private
    public double pobierzPromein(){
        return this.promien;
    }

    //moetda, hermetyzacja, zabezpieczneie pola promien
    public void ustawPromien(double r){
        if (r<0){
            System.out.println("Promien nie moze byc ujemny");
        } else {
            this.promien = r;
        }
    }

    //metoda
    public void Obwod(){
        System.out.println("Obwod wynosi: " + (2 * Math.PI * promien));
    }

    //metoda
    public double Pole(){

        return (Math.PI * Math.pow(promien,2));
    }
}
