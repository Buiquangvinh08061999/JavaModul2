package _14_sort_algorithms.BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort_practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập size:");
        int size = Integer.parseInt(scanner.nextLine());

        int []array = new int[size];

        System.out.println("Nhập " + array.length + " giá trị:" );
        for (int i = 0 ; i < array.length;i++){
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Danh sách mảng là " + Arrays.toString(array));

        bubbleSort(array);
        System.out.println("Danh sách sau khi sort là: " + Arrays.toString(array));
    }

    public static void bubbleSort(int [] array){
        for (int i = 1; i < array.length;i++){
            for (int j = 0; j < array.length-i;j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
