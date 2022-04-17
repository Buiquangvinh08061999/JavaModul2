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


                System.out.println("Nhập số cột: ");
                int number = sc.nextInt();
                int totalColumn =0;
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        if(j == number){
                            totalColumn+=array[i][j];
                        }
                    }
                }
                System.out.println("Tổng cột " + number + " là: " + totalColumn);
            }
        } while (size != 0);

    }
}

