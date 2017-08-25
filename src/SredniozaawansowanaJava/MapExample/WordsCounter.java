package SredniozaawansowanaJava.MapExample;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class WordsCounter {

    public static final String PATH_TO_RESULTS = "C:\\Users\\RENT\\Documents\\ASN\\src\\SredniozaawansowanaJava\\MapExample\\slowa.txt";

    public static List<String> readFile() {

        List<String> read = new ArrayList<>();

        try {
            read = Files.readAllLines(Paths.get(PATH_TO_RESULTS));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return read;
    }

    public static List<String> slowaList() {
        List<String> strings = readFile();
        List<String> pojedynczeSlowa = new ArrayList<>();

        for (String s : strings) {

            String[] split = s.replace(",", "").replace(".", "").split(" ");

            for (String s1 : split) {
                pojedynczeSlowa.add(s1);
            }

            //lub zamiast for
            //pojedynczeSlowa.addAll(Arrays.asList(split));
        }

        return pojedynczeSlowa;
    }

    public static Map<String, Integer> slownikMap() {
        Map<String, Integer> slownik = new HashMap<>();
        List<String> slowaTmp = slowaList();

        for (String s : slowaTmp) {
            if(slownik.containsKey(s)){
                Integer integer = slownik.get(s);
                integer++;
                slownik.put(s, integer);
            } else {
                slownik.putIfAbsent(s, 1);
            }
        }
        return slownik;
    }
}
