package PodstawyJava.Kolejka.Prosta;

public class KolejkaMain {
    public static void main(String[] args) {

        Kolejka kolejka = new Kolejka(5);

        kolejka.dodaj(1);
        kolejka.dodaj(2);
        kolejka.dodaj(3);
        kolejka.dodaj(4);
        kolejka.dodaj(5);

        System.out.println(kolejka.oddaj());
        System.out.println(kolejka.oddaj());
        System.out.println(kolejka.oddaj());
        System.out.println(kolejka.oddaj());

        kolejka.dodaj(7);

        System.out.println(kolejka.oddaj());
        System.out.println(kolejka.oddaj());
    }

}
