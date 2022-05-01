package Exercise_ACU.SelectionSort;
import java.util.Arrays;
public class SortUpAscending_sapxeptangdan {
    public static void main(String[] args) {
        int[] array= {10,5,7,8,4,11,1};
        System.out.println("Mảng ban đầu là: " + Arrays.toString(array));
        shortValue(array);
        System.out.println("Mảng sau khi SelectionSort là:" + Arrays.toString(array));
    }
    public static void shortValue(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
//        return  array;

    }
}
