package ProgObiektowe.abstractExample;

/**
 * Created by RENT on 2017-07-21.
 */
public class Kwadrat extends Figura {


    protected Kwadrat(double a) {
        super(a);
        this.setOpis("Kwadrat");
    }

    @Override
    public double ObliczPole() {
        System.out.println("Pole Kwadratru");
        this.setPole(this.getA() * this.getA());
        return getPole();
    }

    @Override
    public double ObliczObwod() {
        System.out.println("Obwod Kwadratu");
        this.setObwod(4 * this.getA());
        return getObwod();
    }


}
