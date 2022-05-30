package Exercise_ACU.BubbleSort;

import java.util.Arrays;

public class BubleSortPhuongThuc {
    public void sortBuble(int [] array){
        for(int i = 0;i<array.length;i++){
            for(int j = 1; j < array.length;j++){
                if(array[j]< array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubleSortPhuongThuc sort = new BubleSortPhuongThuc();
        int [] array ={1,5,3,6,7,2,9,11,15,14};
        System.out.println("Mang ban dau la: " + Arrays.toString(array));
        sort.sortBuble(array);
        System.out.println("Mang sap khi sap xep  la: " + Arrays.toString(array));
    }
}
