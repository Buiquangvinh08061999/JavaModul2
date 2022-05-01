package LearnJaVa.ArrayBasic.ArrayCoppy;

import java.util.Scanner;

public class Arraycoppy {
    public static void main(String[] args) {
        //Coppy mảng arr1 sang 1 mảng mới;

        int[] arr1 = {10,5,6,7,6,9,7,4};
        int c = 4;
        Scanner sc = new Scanner(System.in);
        int [] arr2 ={5,6};
        String a = "b";
        String[] d = {"a", "b"};
        System.out.println();
        int[] arrcoppy = new int[arr1.length];
        for (int i = 0; i < arr1.length;i++){
            arrcoppy[i] = arr1[i];
            System.out.printf("%d ", arrcoppy[i]);

        }
       
        System.out.println();

    }
}
