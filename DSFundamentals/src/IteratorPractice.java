import java.util.Iterator;
import java.util.LinkedList;

public class IteratorPractice {

    public static void main(String[] args) {
        LinkedList <String> names = new LinkedList<String>();

        names.push("mo");
        names.push("sue");
        names.push("sally");

        Iterator <String> varIterator = names.iterator();

        names.add(2,"adam");

  //      while ((varIterator.hasNext())) {
   //         System.out.println(varIterator.next());
  //      }

        for (String s: names) {
            System.out.println(s);
        }

        // ListIterator<TYPE>Variable = names.listIterator -- another way to do it

        
    }
}
