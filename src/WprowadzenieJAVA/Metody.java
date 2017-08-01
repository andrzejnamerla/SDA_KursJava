package WprowadzenieJAVA;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by RENT on 2017-07-11.
 */
public class Metody {

    //definicja
    public static void PrintMessange(String imie) {
        System.out.println("Witaj " + imie);
    }

    public static void DescribeUser(String name, String surname, int age){
        System.out.println(name + " " + surname + " " + age);
    }

    public static void PrintArray(float[] array){
        for(float i:array){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int AddElements(int a, int b){
        int sum = a+b;

        return sum;
    }

    public static int Factorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++){
            result*=i;
        }
        return result;
    }

    public static int SumArray(int[] array){
        int sum=0;
        for(int i=0; i<array.length; i++){
            sum +=array[i];
        }
        return sum;
    }

    public static float Srednia(float[] tablica){
        float suma = 0;
        for (int i =0; i<tablica.length; i++){
            suma = suma + tablica[i];
        }
        return suma/tablica.length;
    }

    public static float[] InitArrayUser(float[] array2){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Podaj elementy tablicy: ");
        for (int i=0; i < array2.length; i++){
            System.out.println("Podaj "+(i+1)+" element tablicy");
            array2[i]=scanner.nextFloat();
        }
        return array2;
    }

    public static float[] InitArrayRadn(float[] array3) {
        Random random = new Random();
        for (int i=0; i<array3.length; i++){
            array3[i]=random.nextInt(50);
            //array3[i]=random.nextFloat()*50;
        }
        return array3;
    }

    //odwolanie sie do funkcji
    public static void main(String[] args) {

        /*System.out.println("Podaj imie ");
        Scanner scanner = new Scanner(System.in);
        String imieUzyszkodnika = scanner.nextLine();
        PrintMessange(imieUzyszkodnika);
        System.out.println();*/


        /*DescribeUser("Piotr", "Nowicki", 25);
        System.out.println();*/


        /*System.out.println("Podaj wielkosc tablicy: ");
        int i = scanner.nextInt();
        int [] Tablica = new int[i];
        System.out.println("Wpisz liczby do tablicy: ");
        for (int element=0; element<Tablica.length; element++) {
            Tablica[element] = scanner.nextInt();
        }
        PrintArray(Tablica);
        System.out.println();*/


       /* int wynik = AddElements(5, 15);
        System.out.println("Wynik dodawania :" + wynik);
        System.out.println();*/


        /*int liczba = 5;
        int Silnia = Factorial(liczba);
        System.out.println("Silnia: "+Silnia);
        System.out.println();*/


        /*//Random random = new Random(10);
        //int[] tablica2 = new int[]{random.nextInt(),random.nextInt(),random.nextInt()};
        //for (int j:tablica2){
        //    System.out.print(j);
        //}
        int[] tablica2 = new int[]{2,3,4};
        System.out.println(SumArray(tablica2));*/

       /* float[] tablica3 = new float[]{2,4,6,8};
        System.out.println(Srednia(tablica3));
        System.out.println();*/

        float[] tablica4 = new float[10];
        PrintArray(InitArrayUser(tablica4));
        PrintArray(InitArrayRadn(tablica4));

    }


}
