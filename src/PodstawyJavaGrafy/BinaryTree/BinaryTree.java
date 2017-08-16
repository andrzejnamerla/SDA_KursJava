package PodstawyJavaGrafy.BinaryTree;

public class BinaryTree {
    public static void main(String[] args) {

        Node nodeTree = randomBinaryTree(6, 100, 0.5);

        System.out.println("\nPreorder");
        preorder(nodeTree);

        System.out.println("\nInorder");
        inorder(nodeTree);

        System.out.println("\nPostorder");
        postorder(nodeTree);

        System.out.println("\nPoszukiwanie liczby");
        int x = 20;
        System.out.println("Poszukuje liczby " + x + " = " + findInTree(x, nodeTree));

        System.out.println("\nWysokość drzewa");
        System.out.println(getTreeHeight(nodeTree));

        System.out.println("\nDrzewo zbalansowane");
        System.out.println(setBalancedTree(20, 100));


    }
    //do sprawdzenia i dokonczenia
    public static Node setBalancedTree(int n, int z) {
        Node tree = new Node();

        int nLeft = 0;
        int nRight = 0;
        if (n > 0) {
            nLeft = n / 12;
            nRight = n - nLeft - 1;

            int x = (int) (Math.random() * z);
            tree.setKey(x);
            tree.setLeft(setBalancedTree(nLeft, z));
            tree.setRight(setBalancedTree(nRight, z));
            tree.toString();

        }
        return tree;
    }

    public static boolean findInTree(int x, Node node) {
        boolean isInTree = false;
        if (node != null) {
            if (x == node.getKey()) {
                isInTree = true;
            } else {
                isInTree = findInTree(x, node.getLeft());
                if (!isInTree) {
                    isInTree = findInTree(x, node.getRight());
                }
            }
        }
        return isInTree;
    }

    public static int getTreeHeight(Node node) {
        int height = 0;
        if (node == null) {

        } else {
            int leftHeight = getTreeHeight(node.getLeft());
            int rightHeight = getTreeHeight(node.getRight());
            if (leftHeight > rightHeight) {
                height = leftHeight + 1;
            } else {
                height = rightHeight + 1;
            }
        }

        return height;
    }


    public static void preorder(Node node) {
        if (node != null) {
            System.out.println(node.getKey());
            preorder(node.getLeft());
            preorder(node.getRight());
        }
    }

    public static void inorder(Node node) {
        if (node != null) {
            inorder(node.getLeft());
            System.out.println(node.getKey());
            inorder(node.getRight());
        }
    }

    public static void postorder(Node node) {
        if (node != null) {
            postorder(node.getLeft());
            postorder(node.getRight());
            System.out.println(node.getKey());
        }
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
                    if (currentElement.getRight() == null) {
                        currentElement.setRight(newElement);
                        added = true;
                    } else {
                        currentElement = currentElement.getRight();
                    }
                }
                if (added) {
                    System.out.println(currentElement.toString());
                }
            } while (!added);

        }

        return rootElement;
    }
}
