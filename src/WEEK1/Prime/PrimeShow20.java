package WEEK1.Prime;

import java.util.Scanner;

public class PrimeShow20 {
    public static void main(String[] args) {
        int number;
        int count = 1;
        int n = 2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên tố: \b");
        number = sc.nextInt();

        while (count <= number) {
            boolean flag = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(" " + n);
                ;
                count++;
            }
            n++;
        }
    }
}

