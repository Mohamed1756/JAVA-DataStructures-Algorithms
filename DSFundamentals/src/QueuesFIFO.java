import java.util.LinkedList;
import java.util.Queue;

public class QueuesFIFO {


    public static void main(String[] args) {

        // QUEUE FIFO - type LINKED LIST

        Queue <String> namesList = new LinkedList<String>();

        namesList.add("Adam");
        namesList.add("Alex");
        namesList.add("Mohamed");
        namesList.add("Andy");

        System.out.println(namesList);
        namesList.poll();  // removes FIFO

        System.out.println(namesList);

        System.out.println(namesList.peek()); // show next to be FIFO

        // .Contains - checks (boolean)
        System.out.println(namesList.contains("aisis"));

        // find indexth position
        System.out.println(namesList.toArray()[2]); //zeroth element start
    }
}
