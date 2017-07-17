package ProgObiektowe.SpisPracownikow;

public class Company {
    private String name;
    private Employee[] employees;
    private int numberOfEmployees;

    public Company(){
        employees = new Employee[10];
        numberOfEmployees = 0;
    }

    //napisac metode ktora wyswietla wszystkich pracownikow
    public void printEmployees(){
        for (Employee emp : employees){
            emp.describleEmployee();
        }
    }

    //metoda dodawania pracownika
    public void addEmployee(Employee nextEmployee){
        employees[numberOfEmployees] = nextEmployee;
        numberOfEmployees++;
    }
}
