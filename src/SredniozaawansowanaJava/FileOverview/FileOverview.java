package SredniozaawansowanaJava.FileOverview;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOverview {
        /*
        * Zapytac o nazwe katalog
        * Stworzyc katalog o podanej nazwie
        * Zapytac o notatke
        * Dopisac date i zapisac notatke w pliku o nazwie notatka.txt*/

    public static void createDirectoryAndFile() {

        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(createDirectory() + "\\plik.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(createNote());

            //bufferedWriter.flush(); //wypychanie note do pliku w danym momencie
        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void createDirectoryWithResources() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(createDirectory() + "//plik2.txt", true))) {
            bufferedWriter.write(createNote());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String createDirectory() {
        //file.mkdir() tworzenie katalogu
        //file.createNewFile() tworzenie katalogu

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nazwe katalogu: \n(domyslna src/SredniozaawansowanaJava/FileOverview)");
        String directoryName = "src//SredniozaawansowanaJava//FileOverview" + scanner.nextLine();

        File file = new File(directoryName);

        if (file.exists()) {
            System.out.println("Katalog juz istnieje. ");
        } else {
            //zamiast petli if else uzycie operatora trojargumentpowego (warunek ? true : false)
            System.out.println(file.mkdir() ? "Utworzono katalog" : "Nie udalo sie utworzyc katalogu");

            /*boolean mkdir = file.mkdir();
            if (mkdir){
                System.out.println("Utworzono katalog");
            } else {
                System.out.println("Nie udalo sie utworzyc katalogu");
            }*/
        }
        return directoryName;
    }

    public static String createNote() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj notatke: ");
        String note = scanner.nextLine() + "\n";
        return note;
    }
}
