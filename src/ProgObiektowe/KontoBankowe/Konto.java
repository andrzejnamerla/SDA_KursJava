package ProgObiektowe.KontoBankowe;

/**
 * Created by RENT on 2017-07-25.
 */
public interface Konto {
    void Wplata(double kwota);

    double Wyplata(double kwota) throws Exception;

    double getBilans();

}
