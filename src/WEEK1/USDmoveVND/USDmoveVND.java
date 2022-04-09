package WEEK1.USDmoveVND;

import java.util.Scanner;

public class USDmoveVND {
    public static void main(String[] args) {
        double VND = 23000;
        double USD;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập USD cần quy đổii :");
        USD = sc.nextDouble();

        double quyDoi = USD * VND;
        System.out.println("Giá trị VNĐ là: " + quyDoi);
    }
}
