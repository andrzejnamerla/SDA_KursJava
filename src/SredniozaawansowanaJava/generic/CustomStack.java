package SredniozaawansowanaJava.generic;

import java.lang.reflect.Array;

public class CustomStack<T> {
    private int index = 0;
    private int size = 0;

    T[] stack;


    //utworzyc konstruktor, ktory przyjmuje max rozmair stosu
    public CustomStack(Class<T> t, int size) {
        stack = (T[]) Array.newInstance(t, size);
        this.size = size;
    }

    //dodawanie do tablicy
    public void push(T t) {
        if (index < size) {
            stack[index] = t;
            index++;
        } else {
            System.out.println("Stos pelny");
        }
    }

    //usuwanie z tablicy
    public T pop() {
        if (index > 0) {
            T elemnet = stack[--index];
            stack[index] = null;
            return elemnet;
        } else {
            throw new ArrayIndexOutOfBoundsException("Stos jest pusty");
        }
    }
}
