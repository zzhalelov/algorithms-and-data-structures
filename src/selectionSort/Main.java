package selectionSort;

import java.util.Arrays;

public class Main {
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minInd = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minInd = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minInd] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {84, 45, 32, 42, 31};
        System.out.println("Array before: " + Arrays.toString(array));
        selectionSort(array);
        System.out.println("Array after: " + Arrays.toString(array));
    }
}