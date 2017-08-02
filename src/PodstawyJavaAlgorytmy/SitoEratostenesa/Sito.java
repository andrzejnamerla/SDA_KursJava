package PodstawyJavaAlgorytmy.SitoEratostenesa;

import java.util.Scanner;

/**
 * Created by RENT on 2017-08-02.
 */
public class Sito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj gorny zakres: ");
        int zakresGorny = scanner.nextInt();
        int pierwiastek = (int) Math.floor(Math.sqrt(zakresGorny));

        int[] tab = new int[zakresGorny-1];
        for (int i=1; i<zakresGorny;i++){
            tab[i-1]=i+1;
        }

        Pierwsze(tab,pierwiastek);

        for (int i:tab){
            if (i !=0) {
                System.out.println(i);
            }
        }
    }

    public static int[] Pierwsze(int tab[], int pierwiastek){
        for(int i =0; i<tab.length;i++){
            for (int j=i+1; j<tab.length; j++){
                if(tab[j]!=0&&tab[i]!=0&&tab[j]%tab[i]==0){
                    tab[j]=0;
                }
            }
            if(tab[i]>pierwiastek){
                break;
            }
        }
        return tab;
    }


}
