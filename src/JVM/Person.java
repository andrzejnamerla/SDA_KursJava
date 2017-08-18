package JVM;

/**
 * Person class to represent person entity
 *
 * @author AN
 * @since 1.8
 */

public class Person {
    private String name;
    private String surname;
    private int age;

    /**
     * No args constructor to create new Person
     */
    public Person(){

    }

    /**
     * Constructor witch args creating new Person
     */
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }


    /**
     * returns void
     * @param age defines age of person
     * @throws Exception
     */
    public void setAge(int age) {
        this.age = age;
    }
}
