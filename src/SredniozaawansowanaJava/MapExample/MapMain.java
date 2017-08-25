package SredniozaawansowanaJava.MapExample;

import java.util.List;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {

        Map<String, Integer> map = WordsCounter.slownikMap();

        for (String key : map.keySet()){
            System.out.println("Slowo: " + key + " wystapienie: " + map.get(key) + " razy");
        }


        //System.out.println(WordsCounter.readFile());

        //System.out.println(WordsCounter.slowaList());

    }
}
