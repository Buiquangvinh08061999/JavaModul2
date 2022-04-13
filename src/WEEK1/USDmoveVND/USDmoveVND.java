package WEEK1.USDmoveVND;

import java.util.Scanner;

public class USDmoveVND {
    public static void main(String[] args) {

        int USD;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập USD cần quy đổi :");
        USD = sc.nextInt();

        int quyDoi = USD * 23000;

        if (USD < 0) {
            System.out.print("Không cho nhập giá trị âm");
        } else {
//            System.out.println("Giá trị "+ USD +" USD sang VNĐ là: " + quyDoi + "VNĐ");
            System.out.printf("Giá trị: %d %s %d %s" , USD,"USD sang VNĐ là:",quyDoi,"VNĐ" );
        }
    }
}
