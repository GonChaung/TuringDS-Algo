package adt.binarytree;

import java.util.ArrayList;
import java.util.Iterator;

public class InOrderTraversal implements Iterable<Node>{

    Tree tree;
    public InOrderTraversal(Tree tree)
    {
        this.tree = tree;
    }
    @Override
    public Iterator<Node> iterator() {
        return new TreeIterator();
    }
    class TreeIterator implements Iterator<Node>
    {

        Node current;
        ArrayList<Node> items;
        int index = 0;
        public TreeIterator() {
            current = tree.root;
            this.items = new ArrayList<Node>();
            this.inorderTraverse(this.current);
        }
        //lRr

        void inorderTraverse(Node current)
        {
            if(current ==null)
            {
                return;
            }
            //lRr

            //left
            if(current.left != null)
            {
                this.inorderTraverse(current.left);
            }
            //Root
            this.items.add(current);
            //Right
            if(current.right!=null){
                this.inorderTraverse(current.right);
            }
        }
        @Override
        public boolean hasNext() {
            return index < this.items.size();
        }

        @Override
        public Node next() {
            return this.items.get(this.index++);

        }

    }
}