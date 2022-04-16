package LearnJaVa.ArrayBasic.ArrayScanner;


import java.util.Scanner;
import java.util.Arrays;
public class maxArray2_import {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Nhập chiều dài size: ");
            size = sc.nextInt();
            if(size>10){
                System.out.println("Nhập chiều dài size không quá 10");
            }
        }while (size >10);

        array = new int[size];

        for (int i =0; i< array.length;i++){
            System.out.print("Nhập phần tử ["+i+"]: ");
            array[i] = sc.nextInt();
        }
        System.out.println("Giá trị phần tử trong mảng là: "+Arrays.toString(array));/*thay thế vòng for (Tự duyệt phần tử nhập vào để in ra mảng, [1,5,7..v.v])*/

        int max = array[0];
        int index =0;
        for (int i =0; i< array.length;i++){
            if(array[i]> max){
                max=array[i];
                index = i;
            }
        }
        System.out.printf("Giá trị lớn nhất trong mảng là: [%d] nằm ở vị trí thứ %d", max,index);
    }
}
