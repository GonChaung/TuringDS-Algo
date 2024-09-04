package adt.binarytree;

import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InorderTest {
    @Test
    public void testInOrderBaseCase(){
        Node node10 = new Node(10);
        Node node13 = new Node(13);
        Node node15 = new Node(15);

        node10.setLeft(node13);
        node10.setRight(node15);

        Tree tree = new Tree(node10);
        InOrderTraversal inOrderTraversal = new InOrderTraversal(tree);
        Iterator<Node> iterator = inOrderTraversal.iterator();

        assertEquals(node13, iterator.next());
        assertEquals(node10, iterator.next());
        assertEquals(node15, iterator.next());
    }
}
