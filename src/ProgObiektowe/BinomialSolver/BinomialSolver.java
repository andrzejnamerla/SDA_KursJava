package ProgObiektowe.BinomialSolver;

/**
 * Created by RENT on 2017-07-20.
 */
public class BinomialSolver {
    private double a;
    private double b;
    private double c;
    private double x1;
    private double x2;
    private double delta;
    private double fx1;
    private double fx2;

    public BinomialSolver(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getDelta() {
        return delta;
    }

    public double getFx1() {
        return fx1;
    }

    public double getFx2() {
        return fx2;
    }

    public void binomial() {
        delta = (b * b) - (4 * a * c);
        if (delta > 0) {
            x1 = (-b - Math.sqrt(delta)) / (2 * a);
            x2 = (-b + Math.sqrt(delta)) / (2 * a);

            fx1 = a * Math.pow(x1, 2) + b * x1 + c;
            fx2 = a * Math.pow(x2, 2) + b * x2 + c;

        } else if (delta == 0) {
            x1 = (-b) / (2 * a);
            fx1 = a * Math.pow(x1, 2) + b * x1 + c;
        } else {
            System.out.println("\nNie ma pierwiastkow");
        }
    }

    public double calc(double x){
        double fx = a * Math.pow(x,2) + b * x +c;
        return fx;
    }

}
