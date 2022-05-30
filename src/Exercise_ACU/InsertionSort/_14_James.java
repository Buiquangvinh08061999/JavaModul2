package Exercise_ACU.InsertionSort;

import java.util.Arrays;

public class _14_James {
    public static void main(String[] args) {
        int[] array= {1,2,6,3,5,4,10};
        System.out.println("Mảng ban đầu là: " + Arrays.toString(array));
        insertionSort(array);
        System.out.println("Mảng sau khi sort là: " + Arrays.toString(array));
    }

    public static void insertionSort(int[] array){
        int pos,x;
        for (int i= 1;i < array.length;i++){
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;
        }
    }



}
