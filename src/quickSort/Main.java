package quickSort;

public class Main {
    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0 || low >= high) return;

        int middle = low + (high - low) / 2;
        int border = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < border) i++;
            while (array[j] > border) j--;
            if (i <= j) {
                int swap = array[i];
                array[i] = array[j];
                array[j] = swap;
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSort(array, low, j);
        } else if (high > i) {
            quickSort(array, i, high);
        }
    }

    public static void main(String[] args) {
        int[] array = {7, 4, 1, 2, 5, 8, 9, 6, 3};
        quickSort(array, 0, array.length - 1);
        for (int j : array) {
            System.out.println(j + "\n");
        }
    }
}