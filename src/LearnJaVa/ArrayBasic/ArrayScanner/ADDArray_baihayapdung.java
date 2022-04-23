package LearnJaVa.ArrayBasic.ArrayScanner;

import java.util.Arrays;
import java.util.Scanner;

public class ADDArray {
    public static void main(String[] args) {
        int [] array = {10,4,6,7,8,0,0,0,0,0};
        System.out.println("Mang ban dau la: " + Arrays.toString(array));
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so X can chen: ");
        int x = sc.nextInt();
        System.out.println("Nhap vao vi tri can chen: ");
        int index = sc.nextInt();

        addArray(array,x,index);
    }

    public static void addArray(int[] array, int x, int index){
        if(index <=-1 && index >= array.length-1){
            System.out.println("Khong chen duoc phan tu vao mang ");
        }
        for (int i = array.length-1; i >index; i-- ){
                array[i] = array[i-1];
        }
        array[index] = x;
    }
}
