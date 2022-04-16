package LearnJaVa.ArrayBasic.ArrayScanner;

import java.util.Scanner;
import java.util.Arrays;

public class mergeArray {
    public static void main(String[] args) {
        int size1,size2;
        int[] array1, array2 ;
        int[] arrayAll;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nhập chiều size 1(1 trong 2 điều kiện nhập 0 là thoát chương trình): ");
            size1 = sc.nextInt();
            System.out.println("Nhập chiều size 2(1 trong 2 điều kiện nhập 0 là thoát chương trình): ");
            size2 = sc.nextInt();
            if (size1 > 1 && size2 > 1) {

                array1 = new int[size1];
                System.out.println("Nhập các phần tử cho array1: ");
                for (int i = 0; i < array1.length; i++) {
                    System.out.printf("Nhập phần tử thứ [" + i + "] ");
                    array1[i] = sc.nextInt();
                }
                System.out.println("Giá trị phần tử trong mảng array1 là: " + Arrays.toString(array1));


                array2 = new int[size2];
                System.out.println("Nhập các phần tử cho array2: ");
                for (int i = 0; i < array2.length; i++) {
                    System.out.printf("Nhập phần tử thứ [" + i + "] ");
                    array2[i] = sc.nextInt();
                }
                System.out.println("Giá trị phần tử trong array2 là: " + Arrays.toString(array2));


                System.out.println("Mảng sau khi gộp arrayAll1&2 là:");
                int lenth = array1.length + array2.length;
                arrayAll = new int[lenth];
                int count = 0;

                //Cách 1: Để gộp 2 mảng
                for ( int i = 0; i < array1.length ; i++){
                    arrayAll[count] = array1[i];
                    count++;
                }
                for ( int i = 0; i < array2.length ; i++){
                    arrayAll[count] = array2[i];
                    count++;
                }

                  //Cách 2.
//                System.arraycopy(array1, 0, arrayAll,0, array1.length);
//                System.arraycopy(array2,0,arrayAll, array1.length,array2.length);
                System.out.println(Arrays.toString(arrayAll));

            }

        } while (size1 != 0 && size2 != 0);

    }
}
