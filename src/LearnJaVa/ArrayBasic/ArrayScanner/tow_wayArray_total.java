package LearnJaVa.ArrayBasic.ArrayScanner;

import java.util.Arrays;
import java.util.Scanner;

public class tow_wayArray_total {
    public static void main(String[] args) {
        int size;
        int min = 5;
        int max = 10;
        int[][] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập chiều dài size: (Nhập 0 để thoát chương trình)");
            size = sc.nextInt();
            if (size > 1) {
                array = new int[size][size];

                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        array[i][j] = (int) Math.floor(Math.random() * (max - min + 1) + min);
                    }
                }
                System.out.println("Phần tử random ngẫu nhiên của mảng là: "+ Arrays.deepToString(array));

                int total =0;
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        if(array[i] == array[j]){
                            total+=array[i][j];
                        }
                    }
                }
                System.out.println("Tổng đường chéo chính là: " + total);

            }
        } while (size != 0);
        //Dùng str.charAt(i): để duyệt qua các phần tử; nếu có phần từ nào trùng vs biến
        //tim = 'v', thì biến count sẽ đếm số lần (nếu trùng nhau)

    }
}

