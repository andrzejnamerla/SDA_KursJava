package ProgObiektowe.overloading;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-19.
 */
public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imie i nazwisko: ");
        String imie = scanner.next();
        String nazwisko = scanner.next();
        System.out.println("Podaj wiek: ");
        int wiek = scanner.nextInt();

        Student studentInformatyki = new Student();

        Student studentPrawa = new Student(imie, nazwisko);
        System.out.println(studentPrawa.getName() +" "+ studentPrawa.getSurName());

        Student studentMedycyny = new Student(wiek);
        System.out.println(studentMedycyny.getAge());


    }
}
