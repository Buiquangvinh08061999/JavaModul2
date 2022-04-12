package WEEK1.TimUocChungLonNhat;

import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        int a,b;
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if(a==0 || b== 0){
            System.out.println("Không có ước chung lớn nhất: ");
        }
        while (a!=b){
            if(a>b){
                a = a -b;
            }else {
                b = b-a;
            }
        }
        System.out.println("Ước chung lớn nhất là: " + a);
    }
}
