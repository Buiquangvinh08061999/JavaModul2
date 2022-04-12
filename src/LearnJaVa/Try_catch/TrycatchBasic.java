package LearnJaVa.Try_catch;

import java.util.Scanner;

public class TrycatchBasic {
    public static void main(String[] args) {

        int n=0;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Nhap vao so nguyen n");
            n = sc.nextInt();
        }catch (Exception e){
            System.out.println("Nhap du lieu sai");
        }
        System.out.println("Gia tri nhap la: " + n);
        System.out.println("Ket thuc chuong trinh");
    }
}
