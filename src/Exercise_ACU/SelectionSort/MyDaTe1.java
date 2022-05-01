package Exercise_ACU.SelectionSort;
import java.util.Arrays;
public class MyDaTe1 {
    //Tạo phương thức Class: MyDaTe1
   public void mangCoDinh(int[]array){
        System.out.println(Arrays.toString(array));
    }
   public void sortArray(int[]array){
        for(int i=0; i < array.length;i++){
            for (int j =i+1; j< array.length;j++){
                if(array[j] < array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        MyDaTe1 md = new MyDaTe1();
        int []array = {10,5,7,8,4,11,1};


        System.out.println("Mảng ban đầu là: ");
        md.mangCoDinh(array);

        md.sortArray(array);
        System.out.println("Mảng sau khi sắp xếp tăng dần là: ");
        md.mangCoDinh(array);
    }
}
