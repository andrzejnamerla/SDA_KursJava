package ProgObiektowe.abstractExample;

/**
 * Created by RENT on 2017-07-21.
 */
public abstract class Figura {
    private double a;
    private double pole;
    private double obwod;
    private String opis;

    protected Figura(double a){
        this.a = a;
    }

    public abstract double ObliczPole();

    public abstract double ObliczObwod();

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getPole() {
        return pole;
    }

    public double getObwod() {
        return obwod;
    }

    public void setPole(double pole) {
        this.pole = pole;
    }

    public void setObwod(double obwod) {
        this.obwod = obwod;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}
