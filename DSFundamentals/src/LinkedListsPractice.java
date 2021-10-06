import java.util.LinkedList;

public class LinkedListsPractice {

    public static void main(String[] args) {

        // Linked List: can add, remove, clear, add to first & last positions : FIFO
        // called a linked list because each value knows the before & after element

        //basic linked list for strings
        LinkedList namedList = new LinkedList();

        namedList.add("mo");
        namedList.add("ak");
        namedList.add("cg");

        System.out.println(namedList);
        namedList.poll(); //FIFO
        System.out.println(namedList);

        //Integer

        LinkedList <Integer> intLinkedList = new LinkedList<Integer>();

        intLinkedList.add(76);
        intLinkedList.add(78);
        intLinkedList.add(99);

        System.out.println(intLinkedList);
    }
}
