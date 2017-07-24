package ProgObiektowe.abstractExample;

/**
 * Created by RENT on 2017-07-24.
 */
public class Kolo extends Figura {

    protected Kolo(double r) {
        // r = a
        super(r);
        this.setOpis("Kolo");
    }

    @Override
    public double ObliczPole() {
        System.out.println("Pole Kola");
        this.setPole(Math.PI * getA() * getA());
        return getPole();
    }

    @Override
    public double ObliczObwod() {
        System.out.println("Obwod Kola");
        this.setObwod(2 * Math.PI * getA());
        return getObwod();
    }

}
