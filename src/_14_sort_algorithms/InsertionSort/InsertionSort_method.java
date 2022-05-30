package _14_sort_algorithms.InsertionSort;

import java.util.Arrays;

public class InsertionSort_method {
    public static void main(String[] args) {
        int [] array = {10,5,3,9,1,6,11};
        System.out.println("Mảng ban đầu là " + Arrays.toString(array));

        insertionSort(array);
        System.out.println("Mảng sau khi sắp xếp là " + Arrays.toString(array));
    }

    public static void insertionSort(int[] array){
        int key,pos;
        for (int i = 1; i < array.length;i++){
            key = array[i];
            pos = i  ;

            while (pos > 0 && key < array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = key;
        }
    }
}
