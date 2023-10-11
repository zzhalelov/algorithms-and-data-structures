package insertionSort;

import java.util.Arrays;

public class Main {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 5, 7, 9, 4, 1, 2, 8};
        System.out.println("Array before: " + Arrays.toString(array));
        insertionSort(array);
        System.out.println("Array after: " + Arrays.toString(array));
    }
}