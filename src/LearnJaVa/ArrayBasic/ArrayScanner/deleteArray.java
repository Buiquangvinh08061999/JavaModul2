package LearnJaVa.ArrayBasic.ArrayScanner;

import java.util.Arrays;
import java.util.Scanner;

public class deleteArray {
    public static void main(String[] args) {
        int size,i,X,c;
        int [] array;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.printf("Nhập chiều dài size: ");
            size = sc.nextInt();
            if(size>1){
                array = new int[size];
                for (i=0;i< array.length;i++){
                    System.out.print("Nhập phần tử thứ ["+i+"] ");
                    array[i] = sc.nextInt();
                }
                System.out.println("Mảng sau khi nhập  là: "+ Arrays.toString(array));

                System.out.println("Nhập số X phần tử muốn xóa khỏi mảng: ");
                X = sc.nextInt();

                for(c=i=0;i<size;i++){
                    if(array[i] != X){
                        array[c] = array[i];
                        c++;
                    }
                }
                size = c;

                System.out.println("Mảng sau khi xóa phần tử " + X + " là: ");
                for (i=0;i<size;i++){
                    System.out.printf(array[i] + "\t");
                }
                System.out.println("");
            }
        }while (size !=0);
    }
}
