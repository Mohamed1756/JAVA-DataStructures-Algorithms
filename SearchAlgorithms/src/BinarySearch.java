import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int searchArray[] = {5,10,15,20,25,30,35,88,99};
        System.out.println("The input array: " + Arrays.toString(searchArray));
        //key to be searched
        int key = 99;
        System.out.println("\nKey to be searched=" + key);
        //set firstHalf to firstHalf index
        int firstHalf = 0;
        //set lastHalf to lastHalf elements in array
        int lastHalf= searchArray.length-1;
        //calculate mid of the array
        int mid = (firstHalf + lastHalf)/2;
        //while firstHalf and lastHalf do not overlap
        while( firstHalf <= lastHalf ){
            //if the mid < key, then key to be searched is in the firstHalf half of array
            if ( searchArray[mid] < key ){
                firstHalf = mid + 1;
            }else if ( searchArray[mid] == key ){
                //if key = element at mid, then print the location
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                //the key is to be searched in the second half of the array
                lastHalf = mid - 1;
            }
            mid = (firstHalf + lastHalf)/2;
        }
        //if firstHalf and lastHalf overlap, then key is not present in the array
        if ( firstHalf > lastHalf ){
            System.out.println("Element is not found!");
        }
    }
}
