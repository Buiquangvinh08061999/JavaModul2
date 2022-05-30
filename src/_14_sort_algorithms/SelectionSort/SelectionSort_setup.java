package _14_sort_algorithms.SelectionSort;

import java.util.Arrays;

public class SelectionSort_setup {
    public static void main(String[] args) {
        double[] array = {1, 9, 4.5, 6.6, 5.7, -4.5};
        System.out.println("Mảng ban đầu là: " + Arrays.toString(array));

        selectionSort(array);
        System.out.println("Mảng sau khi sort là: " + Arrays.toString(array));
    }

    public static void selectionSort(double[] array) {
        for (int i = 0; i < array.length; i++) {
            double min = array[i];
            int indexMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    indexMin = j;
                }
            }

            if (indexMin != i) {
                array[indexMin] = array[i];
                array[i] = min;
            }

        }
    }
}
