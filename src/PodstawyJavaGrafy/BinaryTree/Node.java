package PodstawyJavaGrafy.BinaryTree;

public class Node {
    private int key;
    private Node right;
    private Node left;

    @Override
    public String toString() {
        String tmp = "";
        int leftInt = 0;
        int rightInt = 0;

        if (this.right != null) {
            rightInt = right.key;
        }

        if (this.left != null) {
            leftInt = left.key;
        }

        return "Node: " + this.key + ", right: " + this.right + ", left" + this.left;

    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }
}
