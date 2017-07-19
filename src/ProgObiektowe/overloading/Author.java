package ProgObiektowe.overloading;

/**
 * Created by RENT on 2017-07-19.
 */
public class Author {

    private String name;
    private String surName;
    private int age;

    public Author(String age){
        //1 konstruktor
        this.name = age;
    }

    public Author(String name, String surName){
        //2 konstruktor
        this.name = name;
        this.surName = surName;
    }

    //laczenie konstruktorow (Chain), dzieki temu unikamy duplikowania kodu
    public Author(String name, String surName, int age){
        //3 konstruktor
        this(name, surName);
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
