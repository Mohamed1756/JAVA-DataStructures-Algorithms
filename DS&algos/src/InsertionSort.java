import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

    public static void main (String[] args) {
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100000);
        }

        System.out.println("Before: ");
        printArray(Arrays.toString(array));

        insertSort(array);

        System.out.println("\n After: ");
        printArray(Arrays.toString(array));

        insertSort(array);




    }



    private static void insertSort(int [] inputArray) {

        for(int i = 1; i < inputArray.length; i++) {
            int key = inputArray[i];
            int j = i-1;


            while (j >= 0 && inputArray[j] > key) {
                int temp = inputArray[j];
                inputArray[j] = inputArray[j + 1];
                inputArray[j+1] = temp;

                j--;
            }
        }
    }


    private static void printArray(String s) {

        System.out.println(s);
    }

}
