package WEEK1.CalculationApplication;

import java.util.Scanner;

public class UngDungTinhTienLai {
    public static void main(String[] args) {
        double money ;
        int month;
        double laiSuat;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số tiền cho vay: ");
        money = sc.nextDouble();
        System.out.println("Nhập số tháng: ");
        month = sc.nextInt();
        System.out.println("Nhập lãi xuất: ");
        laiSuat = sc.nextDouble();

        double tongLaiSuat = 0;
        for(int i=0; i < month;i++){
            tongLaiSuat += money * (laiSuat/100)/12*month;
        }
        System.out.println("Tỗng lãi xuất là:" + tongLaiSuat);
    }
}
