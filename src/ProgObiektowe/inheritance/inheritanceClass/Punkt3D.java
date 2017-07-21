package ProgObiektowe.inheritance.inheritanceClass;

/**
 * Created by RENT on 2017-07-21.
 */
public class Punkt3D extends Punkt2D {

    private double z;

    public Punkt3D() {
        //super() odnosi sie do konstruktora w punkt2D bezparametrowego, mozna odwolac sie do konstrultora z parametrami ale trzeba wtedy podac wartosci, np. 0.0
        super();
        z = 0;
    }

    public Punkt3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String opiszPunkt() {
        return "Moje punkty x " + this.getX() + ", y " + this.getY() + ", z " + z;
    }

    @Override
    public String Opisz(){
        //pobieramy pocztaek tekstu Opisz() z Punkt2D i dodajemy brakujacy, zeby nie kopiowac tego samego
        String opis = super.Opisz();
        return opis + " oraz z: " + z;
    }
}
