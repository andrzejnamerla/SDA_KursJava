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
            System.out.println("\nWybierz opcje: \n1. Dodaj nowego pracownika \n2. Usuń pracownika \n3. Wypisz wszystkich praconików \n0. Wyjdz z programu");
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

    }

    public void printAllEmployees() {
        //logika wyswietlania pracownika
        myCompany.printEmployees();
    }


}
