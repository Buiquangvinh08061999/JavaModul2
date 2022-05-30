package _14_sort_algorithms.BubbleSort;

import java.util.Arrays;

public class BubbleSort_practice {
    public static void main(String[] args) {
        int[] array= {10,5,7,8,4,11,1};
        System.out.println("Mảng ban đầu là: " + Arrays.toString(array));

        bubbleSort(array);
        System.out.println("Mảng sau khi sort là: " + Arrays.toString(array));
    }

    public static void bubbleSort(int[] array){
        for (int i = 1; i < array.length;i++){
            for (int j = 0; j < array.length-i;j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

}
