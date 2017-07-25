package ProgObiektowe.KontoBankowe;

/**
 * Created by RENT on 2017-07-25.
 */
public class KontoOszczednosciowe implements Konto {

    private double bilans;

    public KontoOszczednosciowe(double bilans) {
        this.bilans = bilans;
    }

    //IllegalArgumentException roszerza RuntimeException jest to wyjatek typu unchecked wypisywanie go w klauzuli nie jest obowiaskowe
    @Override
    public void Wplata(double kwota) {
        if (kwota < 0) {
            throw new IllegalArgumentException("Wplacana kwota nie moze byc ujemna");
        } else {
            bilans += kwota;
        }
    }

    //Wyjatek Exception, kiedy dziedziczy po exception jest typem checked zatem nalezy dodac w ifmornacji o rzucanym wyjatku w klauzuli throws
    @Override
    public double Wyplata(double kwota) throws Exception {
        if (kwota > bilans) {
            throw new Exception("Za malo srodkow na koncie");
        } else {
            bilans -= kwota;
        }
        return kwota;
    }

    @Override
    public double getBilans() {
        return bilans;
    }

    protected void setBilans(double bilans) {
        this.bilans = bilans;
    }
}

