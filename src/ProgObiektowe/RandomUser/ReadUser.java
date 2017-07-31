package ProgObiektowe.RandomUser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class ReadUser {
    private static int licznik =0;


    public static String[] Read() throws IOException {

        String[] usersArray = new String[14];

        FileReader fileReader = new FileReader("src/ProgObiektowe/RandomUser/user.txt");

        String linia = "";

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int i = 0;

        while ((linia = bufferedReader.readLine()) != null) {
            usersArray[i] = linia;
            i++;

        }

        return usersArray;


    }

    public static void RandomUser(String[] usersList, String[] randomUser) {
        Random random = new Random();
        boolean exit = false;
        int randomNumebr = random.nextInt(14);

        while (!exit) {

            System.out.println(randomNumebr);
            for (int i = 0; i < randomUser.length; i++) {
                if (usersList[randomNumebr] != randomUser[i]) {
                    exit = true;
                    randomUser[licznik] = usersList[(randomNumebr)];


                }
            }
            licznik++;
        }
    }

}