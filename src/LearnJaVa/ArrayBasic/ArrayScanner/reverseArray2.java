package LearnJaVa.ArrayBasic.ArrayScanner;

import java.util.Scanner;
import java.util.Arrays;
public class reverseArray2 {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập phần tử size: ");
            size = sc.nextInt();
            if(size>20){
                System.out.print("Phần tử size không quá 20");
            }
        }while (size>20);

        array = new int[size];
        for (int i = 0; i < array.length;i++){
            System.out.printf("Nhập phần tử thứ ["+i+"]: ");
            array[i] = sc.nextInt();
        }
        System.out.println("Mảng phần tử sau khi nhập là: "+Arrays.toString(array)); /*thay thế vòng for (Tự duyệt phần tử nhập vào để in ra mảng, [1,5,7..v.v])*/

        /*Công thức đảo ngược mảng*/
        for (int i = 0; i < array.length/2;i++){
            int temp = array[i];
            array[i] = array[array.length -i - 1];
            array[array.length -i - 1] =temp;
        }
        System.out.println("Mảng sau khi đảo ngược là: "+Arrays.toString(array));/*thay thế vòng for (Tự duyệt phần tử nhập vào để in ra mảng, [1,5,7..v.v])*/

    }
}
