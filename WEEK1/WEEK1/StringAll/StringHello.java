package WEEK1.StringAll;

import java.util.Scanner;

public class StringHello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên của bạn: ");

        String name = sc.nextLine();
        System.out.println("Hello " + name);
    }
}
