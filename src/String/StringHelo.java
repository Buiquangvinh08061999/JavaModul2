package String;

import java.util.Scanner;

public class StringHelo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập tên của bạn: ");

        String name = sc.nextLine();
        System.out.println("Helo " + name);
    }
}
