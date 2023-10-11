package binarySearch;

//это алгоритм поиска элемента в отсортированном массиве или списке, работающий следующим образом: на каждом шаге алгоритма текущий диапазон поиска делится на две части, и сравнивается средний элемент этого диапазона с искомым значением
//this is an algorithm for searching for an element in a sorted array or list, which works as follows: at each step of the algorithm, the current search range is divided into two parts, and the average element of this range is compared with the desired value
public class Main {
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (array[middle] == target) {
                return middle;
            } else if (array[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 8, 13, 21, 34, 55};
        int target = 5;
        int index = binarySearch(array, target);
        if (index != -1) {
            System.out.println("Index = " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}