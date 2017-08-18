package JVM;

public class Main {

    private static final String PATH_TO_FILE = "C:\\Users\\RENT\\Documents\\ASN\\src\\JVM\\plik.txt";

    public static void main(String[] args) throws InterruptedException {

        //String calyPlik = FileOperations.readFile(PATH_TO_FILE);

        String calyPlik = FileOperations.readFileWithStringBuilder(PATH_TO_FILE);

        System.out.println(calyPlik);

    }

}
