import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

public class HashFunctions {

    public static void main(String[] args) {

        // A hash table is a data structure that is used to store keys/value pairs.
        // It uses a hash function to compute an index into an array in which an element will be inserted or searched.
        Hashtable <Integer,String> myTable = new Hashtable<>(); // O(n)

        myTable.put(1, "Mohamed 1st");
        myTable.put(12, "forGeeks");
        myTable.put(15, "A computer");
        myTable.put(3, "Portal");

        System.out.println(myTable);
        myTable.remove(3);
        System.out.println(myTable);


//A MAP IS A COLLLECTION OF KEY & VALUE PAIRS

        hashMapPractice();
        hashSetPractice();
    }

    static void hashMapPractice() {
        // create empty HashMap - employee ID
        HashMap <String, Integer> hMap = new HashMap<>();

        hMap.put("Mohamed", 141);
        hMap.put("jake", 171);
        hMap.put("uto", 2101);
        hMap.put("solo", 1919);

        System.out.println(hMap);
        System.out.println(hMap.get("Mohamed"));

        hMap.put("Joker", 8282);

    }

    static void hashSetPractice(){

        HashSet<String> hSets = new HashSet<>();
        hSets.add("India");
        hSets.add("America");
        hSets.add("UK");

        // Displaying the HashSet
        System.out.println(hSets);

        // Checking if India is present or not
        System.out.println("\nHashSet contains India or not:"
                + hSets.contains("India"));

        // Removing items from HashSet using remove()
        hSets.remove("America");

        // Printing the HashSet
        System.out.println("\nList after removing Australia:" + hSets);

        // Iterating over hash set items
        System.out.println("\nIterating over list:");
        Iterator<String> i = hSets.iterator();

        while (i.hasNext())
            System.out.println(i.next());
    }

    }

