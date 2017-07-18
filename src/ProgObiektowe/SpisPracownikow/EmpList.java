package ProgObiektowe.SpisPracownikow;

import java.util.Scanner;


public class EmpList {
    private Scanner scanner;
    private Company myCompany;

    public EmpList() {
        this.myCompany = new Company();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        boolean exit = false;

        while (exit == false) {
            System.out.println("\nWybierz opcje: \n1. Dodaj nowego pracownika \n2. Usuń pracownika \n3. Wypisz wszystkich praconików \n4. Wypisz srednia wielkosc zarobkow \n5. Wypisz sredni wiek pracownikow \n6. Najwieksza pensja \n0. Wyjdz z programu");
            int option = scanner.nextInt();

            switch (option) {
                case 1: {
                    addEmployeeToMyCompany(); //lokalna metoda
                    break;
                }
                case 2: {
                    deleteEmployeeFromMyCompany();
                    break;
                }
                case 3: {
                    printAllEmployees();
                    break;
                }
                case 4: {
                    printAverageSalary();
                    break;
                }
                case 5: {
                    printAverageAge();
                    break;
                }
                case 6: {
                    printHigestSalary();
                    break;
                }
                case 0: {
                    exit = true;
                    break;
                }
                default: {
                    System.out.println("Nie ma takiej opcji, podaj jeszcze raz!");
                }
            }
        }
    }


    //Metoda lokalna, ktora sluzy do skrocenia switcha
    public void addEmployeeToMyCompany() {
        Employee nextEmp = new Employee();
        System.out.println("Podaj imie: ");
        nextEmp.setName(scanner.next());

        System.out.println("Podaj nazwisko: ");
        nextEmp.setSurname(scanner.next());

        System.out.println("Podaj wiek: ");
        nextEmp.setAge(scanner.nextInt());

        System.out.println("Podaj pensje: ");
        nextEmp.setSalary(scanner.nextDouble());

        //metoda wykonana na obiekcie myCompany, gdzie myCompany to pole prywatne klasy
        myCompany.addEmployee(nextEmp);

    }

    public void deleteEmployeeFromMyCompany() {
        //logika usuwania pracownika
        System.out.println("Pracownikow nie zwalniamy!");
    }

    //Metoda uzywa metode foreach i powoduje NullPointerExeption, gdy liczba pracownikow jest mniejsza niz maksymalna
    public void printAllEmployeesBad() {
        //logika wyswietlania pracownika
        myCompany.printEmployeesBad();
    }
    public void printAllEmployees(){
        myCompany.printEmployees();
    }

    public void printAverageSalary(){
        System.out.println(myCompany.countAverageSalary());
    }

    public void printAverageAge(){
        System.out.println(myCompany.countAverageAge());
    }

    public void printHigestSalary(){
        myCompany.getEmployeeWithHigestSalary();
    }

}
