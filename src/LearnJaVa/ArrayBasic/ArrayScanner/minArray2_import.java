package LearnJaVa.ArrayBasic.ArrayScanner;

import java.util.Arrays;
import java.util.Scanner;

public class minArray2_import {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.printf("Nhập chiều dài size: ");
            size = sc.nextInt();
            if(size>20){
                System.out.printf("Chiều dài size không quá 20");
            }
        }while (size>20);

        array = new int[size];
        for (int i = 0; i < array.length;i++){
            System.out.printf("Nhập phần tử["+i+"]: ");
            array[i] = sc.nextInt();
        }
        System.out.println("Giá trị phần tử trong mảng là: "+ Arrays.toString(array));/*thay thế vòng for (Tự duyệt phần tử nhập vào để in ra mảng, [1,5,7..v.v])*/

        int min = array[0];
        for(int i = 0 ; i < array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.printf("Giá trị nhỏ nhất trong mảng là [%d] ", min);
    }
}
