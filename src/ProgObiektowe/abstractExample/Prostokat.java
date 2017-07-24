package ProgObiektowe.abstractExample;

/**
 * Created by RENT on 2017-07-21.
 */
public class Prostokat extends Figura {
    private double b;

    protected Prostokat(double a, double b) {
        super(a);
        this.b = b;
        this.setOpis("Prostokat");

    }

    @Override
    public double ObliczPole() {
        System.out.println("Pole Prostokatka");
        this.setPole(this.getA() * this.b);
        return getPole();
    }

    @Override
    public double ObliczObwod() {
        System.out.println("Obwod Prostokata");
        this.setObwod(2 * this.getA() + 2 * this.b);
        return getObwod();
    }

}
