package ProgObiektowe.overloading;


public class Student {

    private String name;
    private String surName;
    private int age;
    private int nrIndex;
    private int yearStudies;

    //konstruktor bezparamentrowy
    public Student() {

    }


    public Student(String name, String surName){
        this.name = name;
        this.surName = surName;
    }

    public Student(int age){
        this.age=age;
    }

    /*public Student(String name){
        this.name = name;
    }*/

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public int getNrIndex() {
        return nrIndex;
    }

    public int getYearStudies() {
        return yearStudies;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Wiek nie moze byc minejszy od zera");
        } else {
            this.age = age;
        }
    }

    public void setNrIndex(int nrIndex) {
        this.nrIndex = nrIndex;
    }

    public void setYearStudies(int yearStudies) {
        this.yearStudies = yearStudies;
    }
}
