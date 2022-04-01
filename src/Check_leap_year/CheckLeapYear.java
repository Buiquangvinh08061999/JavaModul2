package Check_leap_year;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập năm kiểm tra:");
        year = sc.nextInt();

        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("Năm " + year +" là năm nhuận");
                }else {
                    System.out.println("Năm " + year +" không phải là năm nhuận");
                }
            }else {
                System.out.println("Năm " + year +" là năm nhuận");
            }
        }else {
            System.out.println("Năm " + year +" không phải là năm nhuận");
        }

    }
}
