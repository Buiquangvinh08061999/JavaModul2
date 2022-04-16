package LearnJaVa.ArrayBasic.ArrayScanner;

import java.util.Scanner;
import java.util.Arrays;
public class find2maxArray {
    public static void main(String[] args) {
        int size1,size2;
        int min, max;
        int [][] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập chiều dài của mảng(dòng): ");
            size1 = sc.nextInt();
            System.out.println("Nhập chiều dài của mảng(cột): ");
            size2 = sc.nextInt();
            System.out.println("Nhập số randam max ngẫu nhiên: ");
            max =sc.nextInt();
            System.out.println("Nhập số randam min ngẫu nhiên: ");
            min = sc.nextInt();
            if(size1 > 30 && size2 >30){
                System.out.println("Chiều dài size không quá 30 ");
            }
        }while (size1 >30 && size2 >30);

        array = new int[size1][size2];
        for (int i = 0; i< array.length;i++){
            for(int j= 0; j< array[i].length;j++){
                array[i][j] =(int) Math.floor((Math.random() * max - min + 1) + min);
            }
        }
        System.out.println(Arrays.deepToString(array));

        int so_max = array[0][0];
        for (int i = 0; i< array.length;i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] > so_max){
                    so_max = array[i][j];
                }
            }
        }
        System.out.println("Số lớn nhất trong mảng là : " + so_max);



    }
}
