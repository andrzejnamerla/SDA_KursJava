package SredniozaawansowanaJava.generic;

public class DemoProg {
    public static void main(String[] args) {

        CustomStack<String> customStack = new CustomStack<>(String.class, 5);

        customStack.push("asd");
        String pop = customStack.pop();
        System.out.println(pop);
        customStack.pop();



    }
}
