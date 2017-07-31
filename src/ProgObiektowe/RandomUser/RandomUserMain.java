package ProgObiektowe.RandomUser;

import java.io.IOException;

import static ProgObiektowe.RandomUser.ReadUser.RandomUser;
import static ProgObiektowe.RandomUser.ReadUser.Read;

/**
 * Created by RENT on 2017-07-31.
 */
public class RandomUserMain {

    public static void main(String[] args) {
        String[] usersList = new String[14];
        String[] randomUser = new String[14];

        try {

            usersList = Read();
        } catch (IOException e) {
            e.printStackTrace();
        }

       /* //wypisywanie listy osob z pliku
        for (int i= 0; i<usersList.length; i++){
            System.out.println(usersList[i]);
        }*/

        // losowanie osoby
        RandomUser(usersList, randomUser);
        RandomUser(usersList, randomUser);
        RandomUser(usersList, randomUser);
        RandomUser(usersList, randomUser);
        RandomUser(usersList, randomUser);
        RandomUser(usersList, randomUser);
        RandomUser(usersList, randomUser);
        RandomUser(usersList, randomUser);

        //System.out.println(randomUser[0]);

        for (int i= 0; i<randomUser.length; i++){
            System.out.println(randomUser[i]);
        }


    }


}
