package ProgObiektowe.KontoBankowe;

/**
 * Created by RENT on 2017-07-25.
 */
public class MaleKonto extends KontoOszczednosciowe {
    private double limit;

    public MaleKonto(double bilans, double limit) {
        super(bilans);
        this.limit = limit;
    }

    @Override
    public double Wyplata(double kwota) throws Exception {
        if (kwota > limit) {
            throw new Exception("Za duza kwota, przekroczono limit " + limit);
        }
        return super.Wyplata(kwota);
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
}
