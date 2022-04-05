package String;

import java.util.Scanner;

public class String_do_while {
    public static void main(String[] args) {
        //Không nhập vào Helo: Chương trình sẽ không kết thúc.

        String password;
        Scanner sc = new Scanner(System.in);
        do {
            password= sc.nextLine();
        }while (!password.equals("Heloo"));
    }
}
