package LearnJaVa.ArrayBasic.ArrayScanner;

import java.util.Scanner;
import java.util.Arrays;

public class numberStudentPass {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.printf("Nhập chiều dài size : ");
            size = sc.nextInt();
            if(size>20){
                System.out.println("Mời bạn nhập lại, chiều dài size không quá 20: ");
            }
        }while (size>20);

        array = new int[size];
        for (int i =0; i< array.length;i++){
            System.out.printf("Nhập tử thứ["+i+"] ");
            array[i] = sc.nextInt();
        }
        System.out.println("Mảng phần tử sau khi nhập là: "+Arrays.toString(array));
        //Tạo biến đếm count =0; để khi điều kiện đúng biến đếm sẽ tăng lên;
        // Đếm số học sinh (7 đến 10) điểm;
        int count =0;
        for (int i=0;i< array.length;i++){
            if (array[i]>=7 && array[i]<=10){
                count ++;
            }
        }
        System.out.print("Số học sinh thi đậu trong điểm (7 đến 10) là: "+count +" học sinh");

    }
}
