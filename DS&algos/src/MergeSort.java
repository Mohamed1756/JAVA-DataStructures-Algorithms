import java.util.Random;


public class MergeSort {

    public static void main (String[] args) {
        Random random = new Random();
        int[] array = new int[100000000];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100000);
        }

        System.out.println("Before: ");
      //  printArray(array);

        mergeSort(array);

        System.out.println("\n After: ");
      //  printArray(array);

        mergeSort(array);



    }

    private static void mergeSort(int[] inputArray) {
        int arrayLength = inputArray.length;

        if (arrayLength < 2) return;

        // divide array
        int midPoint = arrayLength/2;

        int [] leftHalf = new int[midPoint];
        int [] rightHalf = new int[arrayLength - midPoint]; // for odd numbers

        // leftHalf

        for (int i = 0; i < midPoint; i++) {
            leftHalf[i] = inputArray[i]; // gets left half of original array
        }

        for (int i = midPoint; i < arrayLength; i++) {
            rightHalf[i - midPoint] = inputArray[i]; // gets right half of original array
        }
        // merge sort

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        // call
        merge(inputArray, leftHalf, rightHalf);
    }

    private static void merge(int[] inputArray, int [] leftHalf,  int [] rightHalf ) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j =0, k = 0; // k is the iterator for merged array

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                inputArray[k] = leftHalf[i]; // add smallest element to new array
                i++;
            }
            else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        // add remaining elements

        while (i < leftSize) {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
