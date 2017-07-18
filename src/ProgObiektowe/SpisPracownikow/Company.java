package ProgObiektowe.SpisPracownikow;

public class Company {
    private String name;
    private Employee[] employees;
    private int numberOfEmployees;

    public Company() {
        employees = new Employee[10];
        numberOfEmployees = 0;
    }

    //Bledna metoda zwracajaca blad NullPointerExeption, napisac metode ktora wyswietla wszystkich pracownikow
    public void printEmployeesBad() {
        for (Employee emp : employees) {
            emp.describleEmployee();
        }
    }

    //poprwaiona metoda wypisywania pracownikow bez bledu
    public void printEmployees() {
        if (numberOfEmployees == 0) {
            System.out.println("Nie ma jeszcze pracownikow");
        } else {
            //petla dzieki, ktorej nie wyskakuje blad przy null, sprawdza ilosc wpisanych elementow (prawonikow)
            for (int i = 0; i < numberOfEmployees; i++) {
                //pierwsza wersja z dodatkowa zmienna pomocniczej
            /*Employee printEmp = employees[i];
            printEmp.describleEmployee();*/

                //druga wersja bez dodatkowej zmiennej
                employees[i].describleEmployee();
            }
        }
    }

    //metoda dodawania pracownika
    public void addEmployee(Employee nextEmployee) {
        employees[numberOfEmployees] = nextEmployee;
        numberOfEmployees++;
    }

    public double countAverageSalary() {
        double averageSalary = 0;
        if (numberOfEmployees == 0) {
            System.out.println("Nie ma jeszcze pracownikow");
        } else {

            double salary = 0;
            //policzyc srednia pensje dla pracownikow
            for (int i = 0; i < numberOfEmployees; i++) {
                salary += employees[i].getSalary();
            }
            averageSalary = salary / numberOfEmployees;

        }
        return averageSalary;
    }

    public double countAverageAge() {
        //policzyć średni wiek
        double averageAge = 0;
        if (numberOfEmployees == 0) {
            System.out.println("Nie ma jeszcze pracownikow");
        } else {

            double age = 0;
            for (int i = 0; i < numberOfEmployees; i++) {
                age += employees[i].getAge();
            }
            averageAge = age / numberOfEmployees;

        }
        return averageAge;
    }

    public void getEmployeeWithHigestSalary() {
        //znalesc pracownika z najwieksza wyplata
        if (numberOfEmployees == 0) {
            System.out.println("Nie ma jeszcze pracownikow");
        } else {
            double higestSalary = 0;
            Employee higestSalaryEmp = new Employee();
            for (int i = 0; i < numberOfEmployees; i++) {
                if (higestSalary < employees[i].getSalary()) {
                    higestSalary = employees[i].getSalary();
                    higestSalaryEmp = employees[i];
                }
            }
            higestSalaryEmp.describleEmployee();
            System.out.println("Wysokosc wynagrodzenia: " + higestSalary);
        }
    }

}
