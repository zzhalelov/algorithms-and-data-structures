package bubbleSort;

import java.util.Arrays;

public class Main {
    public static void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 1, 5, 3};
        System.out.println("Array before: " + Arrays.toString(array));
        bubbleSort(array);
        System.out.println("Array after: " + Arrays.toString(array));
    }
}