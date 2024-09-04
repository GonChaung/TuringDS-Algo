package adt.binarytree;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Iterator;

public class Tree {
    Node root;

    public Tree(){}

    public Tree(Node root){
        this.root = root;
    }

    public void insert(int value){
        Node newNode = new Node(value);
        this.insert(newNode);
    }

    public void insert(Node newNode){
        if(root == null){
            root = newNode;
        }
        else {
            Node current = root;
            Node parent;

            while (true){
                parent = current;
                if (newNode.value < current.value){
                    current = current.left;
                    if (current == null){
                        parent.left = newNode;
                        return;
                    }
                }
                else{
                    current = current.right;
                    if(current == null){
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public Node search(int value){
        Node current = root;
        while (current != null){
            System.out.println("Step");
            if(current.value == value){
                return current;
            }
            if (value < current.value){
                current = current.left;
            }
            else {
                current = current.right;
            }
        }
        return null;
    }

    public void delete(int value){
        Node current = this.root;
        Node parent = this.root;
        boolean isLeftChild = true;

        while(current.value != value){
            parent = current;
            if (value < current.value){
                current = current.left;
                isLeftChild = true;
            }
            else {
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current.isLeaf()){
            System.out.println("Leaf delete code");
            if(isLeftChild){
                parent.left = null;
            }
            else{
                parent.right = null;
            }
        } else if (current.haveOnlyLeftChild()){
            System.out.println("Left child only");
            if(isLeftChild){
                parent.left = current.left;
            } else {
                parent.right = current.right;
            }
        } else if (current.haveOnlyRightChild()){
            System.out.println("Right child only");
            if(isLeftChild){
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        } else if (current.haveBothChild()){
            System.out.println("Have both child");
            Node inOrderSuccessor = this.getInOrderSuccessor(value);
            int temp = inOrderSuccessor.value;
            this.delete(inOrderSuccessor.value);
            current.value = temp;
        }
    }

    public Node getInOrderSuccessor(int value){
        InOrderTraversal traversal = new InOrderTraversal(this);
        Iterator<Node> iterator = traversal.iterator();
        Node current = iterator.next();
        Node next;
        while ( iterator.hasNext()){
            next = iterator.next();
            if (current.getValue() == value){
                return next;
            }
            current = next;
        }
        return null;
    }
}
