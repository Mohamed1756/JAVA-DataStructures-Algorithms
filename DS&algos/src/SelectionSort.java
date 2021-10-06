import java.util.Arrays;

public class SelectionSort {

    public static void main (String[] args) {
        int [] array = {7,23,5,34,55,1,6};
        print(Arrays.toString(array));

        int minValue, minIndex, temp = 0;

        for (int i = 0; i < array.length; i++) {
                minValue = array[i];
                minIndex = i;

                for (int j = i; j < array.length; j++) {
                    if (array[j] < minValue ) {
                        minValue = array[j];
                        minIndex = j;
                    }
                }

                if (minValue < array[i]) {
                    temp = array[i];
                    array[i] = array[minIndex];
                    array[minIndex] = temp;
                }
        }
        print(Arrays.toString(array));
    }

    private static void print(String s) {
        System.out.println(s);
    }


}
