package PodstawyJavaGrafy.BinaryTree;

public class BinaryTree {
    public static void main(String[] args) {

        randomBinaryTree(6,10,0.5);

    }

    /*
    * n - liczba elementów drzewa
    * z - zakres losowania
    * p - prawdopodobienstwo lewego poddrzewa
    * node - elementy drzewa
    * */
    public static Node randomBinaryTree(int n, int z, double p) {

        Node rootElement = new Node();
        rootElement.setKey((int) (Math.random() * z));

        Node currentElement = rootElement;
        for (int i = 0; i < n; i++) {
            Node newElement = new Node();
            newElement.setKey((int) (Math.random() * z));

            boolean added = false;
            do {
                if (Math.random() < p) {
                    if (currentElement.getLeft() == null) {
                        currentElement.setLeft(newElement);
                        added = true;
                    } else {
                        currentElement = currentElement.getLeft();
                    }
                } else {
                    if (currentElement.getRight()==null){
                        currentElement.setRight(newElement);
                        added = true;
                    } else {
                        currentElement = currentElement.getRight();
                    }
                }

            } while (!added);

        }

        return rootElement;
    }
}
