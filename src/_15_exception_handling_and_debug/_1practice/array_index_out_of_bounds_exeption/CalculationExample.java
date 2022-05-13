package _15_exception_handling_and_debug._1practice.array_index_out_of_bounds_exeption;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập x:");
        int x = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập y:");
        int y = Integer.parseInt(scanner.nextLine());

        caculate(x,y);
    }

   public static void caculate(int x, int y){
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Tổng x / y = " + d);
        } catch (Exception e){
            System.out.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }
}
