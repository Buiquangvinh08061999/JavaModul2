package Exercise_ACU.SelectionSort;

import java.util.Arrays;

public class SelectionePhuongThuc {
    //Dùng static: phải có rertun trả về,  int []sort(int...array): Cách truyền vào 1 một mảng khai báo ở hàm main
    public static int []sort(int...array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++){ /*Nếu j < arr[minindex] tức là vị trí j[1] < arr[0](i[0]) thì hoán đổi*/
                if(array[j] < array[minIndex]){
                    minIndex = j;
                    int temp = array[minIndex];
                    array[minIndex] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        SelectionePhuongThuc sort = new SelectionePhuongThuc();
        int [] array = {10,6,8,4,11,2,15};
        System.out.println("Mảng ban đầu là: " + Arrays.toString(array));

        sort.sort(array);
        System.out.println("Mảng sau khi sắp xếp tăng dần là : " + Arrays.toString(array));
    }
}
