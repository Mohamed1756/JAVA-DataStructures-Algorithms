import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {

        //STACK LIFO - PUSH-DOWN

        Stack <Integer> lifo = new Stack<Integer>();

        lifo.push(20);
        lifo.push(10);
        lifo.push(220);
        lifo.push(820);

        // peek() shows what is on top of the stack
        // pop() removes
        // search() returns object index

        System.out.println(lifo.peek());
        System.out.println(lifo);

        lifo.pop();
        System.out.println(lifo);

        System.out.println(lifo.search(20)); // find 20 - return index - 3rd item to be removed
    }
}
