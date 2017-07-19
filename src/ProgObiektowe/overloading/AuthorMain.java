package ProgObiektowe.overloading;

/**
 * Created by RENT on 2017-07-19.
 */
public class AuthorMain {
    public static void main(String[] args) {

        Author Mickiewicz = new Author("Adam", "Mickiewicz", 25);

        System.out.println(Mickiewicz.getName() + " " + Mickiewicz.getSurName() + " " + Mickiewicz.getAge());

    }
}
