package _14_sort_algorithms.InsertionSort;

import java.util.Arrays;

public class InsertionSort_show_setup {
    public static void main(String[] args) {
        int array[] = {12, 11, 13, 5, 6};
        System.out.println("Mảng ban đầu là:");
        display(array);

        insertionSort(array);
        System.out.println("Mảng sau khi sort là: ");
        display(array);
    }

    public static void insertionSort(int [] array){
        int key, pos;
        for (int i = 1; i< array.length;i++){
            key = array[i];
            pos = i - 1;

            while (pos >= 0 && key < array[pos]){

                array[pos + 1] = array[pos];
                pos--;
            }
            array[pos + 1] = key;

            System.out.println("Step " + i + " push " + array[pos + 1] + " in an subarray");
            display(array);
        }
    }

    public static void display(int [] array){
        for (int i = 0; i < array.length;i++){
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
}
