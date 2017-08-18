package JVM;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileOperations {

    public static String readFile(String path) throws InterruptedException {

        // Obiekt do odczytu bufora danych
        BufferedReader bufferedReader = null;
        String result = "";
        String line = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            while (null != (line = bufferedReader.readLine())) {
                result += "\n" + line;
                Thread.sleep(100);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != bufferedReader) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        return result;
    }

    public static String readFileWithStringBuilder(String path) throws InterruptedException {

        // Obiekt do odczytu bufora danych
        BufferedReader bufferedReader = null;
        StringBuilder stringBuilder = new StringBuilder();
        String line = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            while (null != (line = bufferedReader.readLine())) {
                stringBuilder.append("\n" + line);
                Thread.sleep(50);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != bufferedReader) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        return stringBuilder.toString();
    }

}
