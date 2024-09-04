package adt.binarytree;

public class Node {
    int value;
    Node left;
    Node right;

    public Node(int value){
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getRight(){
        return right;
    }

    public int getValue() {
        return value;
    }

    public boolean isLeaf(){
        return left == null && right == null;
    }

    public boolean haveOnlyLeftChild(){
        return left != null & right == null;
    }

    public boolean haveOnlyRightChild(){
        return left == null & right != null;
    }

    public boolean haveBothChild(){
        return left != null & right != null;
    }
}
