package WEEK1.Prime;

import java.util.Scanner;

public class PrimeShow20 {
    public static void main(String[] args) {
        int number;
        int count = 0;
        int N =2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên tố muốn in ra:");
        number = sc.nextInt();

        while (count < number) {
            boolean flag = true;
            for (int i = 2; i <= N-1; i++) {
                if (N % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(" " + N);
                count++;
            }
            N++;
        }
    }
}

