package Exercise_ACU.InsertionSort;

import java.util.Arrays;

public class InsertionSortPhuongThuc {
    // public void tự nhận giá trị . không cần trả về return.
    //InsertionSort: so sánh giá trị j--, tức là nhảy lui

    public  void sort (int[]array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > array[i]) {
                    int temp = array[j+1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        InsertionSortPhuongThuc sort = new InsertionSortPhuongThuc();
        int [] array = {1,6,2,4,11,5};
        sort.sort(array);

        System.out.println("Mảng InsertionSort: " + Arrays.toString(array));
    }
}
