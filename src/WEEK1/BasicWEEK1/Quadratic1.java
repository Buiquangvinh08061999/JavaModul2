package WEEK1.BasicWEEK1;

import java.util.Scanner;

public class Quadratic1 {
    public static void main(String[] args) {

        double a, b, x;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập a:");
        a = sc.nextDouble();
        System.out.println("Nhập b:");
        b = sc.nextDouble();

        if (a != 0) {
            x = -b / a;
            System.out.println("Phương trình có ngiệm duy nhất là: " + x);
        } else if ( a==0 && b == 0) {
            System.out.println("Phhương trình có vô số ngiệm");
        }else if( a== 0 && b !=0) {
            System.out.println("Phương trình vô ngiệm");
        }
    }
}
