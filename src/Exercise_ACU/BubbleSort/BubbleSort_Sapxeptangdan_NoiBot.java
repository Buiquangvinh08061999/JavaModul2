package Exercise_ACU.BubbleSort;
import java.util.Arrays;
public class BubbleSort_Sapxeptangdan_NoiBot {
    public static void main(String[] args) {
        int [] array={5,1,4,2,8};
        System.out.println("Mảng ban đầu là: " + Arrays.toString(array));

        sortValue(array);
        System.out.println("Mảng sau khi BubbleSort là: " +Arrays.toString(array) );
    }

    public static int[] sortValue(int[] array){
        for(int i = 0; i< array.length; i++){
            for(int j =0; j < array.length-i-1;j++){

                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] =array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;

    }
}
