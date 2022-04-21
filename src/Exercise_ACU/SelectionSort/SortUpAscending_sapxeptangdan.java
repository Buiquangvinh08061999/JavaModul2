package Exercise_ACU.SelectionSort;
import java.util.Arrays;
public class Bai1 {
    public static void main(String[] args) {
        int[] array= {10,7,5,6,8,9,22,2,3};
        System.out.println("Mảng ban đầu là: " + Arrays.toString(array));
        maxValue(array);
        System.out.println("Mảng sau khi sắp xếp tăng dần là:" + Arrays.toString(array));
    }
    public static int[] maxValue(int[] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i] > array[j]){
                    int x = array[i];
                    array[i] = array[j];
                    array[j] = x;
                }
            }
        }
        return  array;

    }
}
