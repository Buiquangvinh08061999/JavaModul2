package WEEK1.ThietKeMeNu;

import java.util.Scanner;

public class MeNu {
    public static void main(String[] args) {
    //Thiết kế menu cho ứng dụng,tham khảo
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter choice: ");
        while (true) {
             choice = sc.nextInt();
             switch (choice){
                 case 1:
                     System.out.println("1. Draw the triangle");
                     System.out.println("*****");
                     System.out.println("****");
                     System.out.println("***");
                     System.out.println("**");
                     System.out.println("*");
                     break;
                 case 2:
                     System.out.println("1. Draw the square");
                     System.out.println("* * * * *");
                     System.out.println("* * * * *");
                     System.out.println("* * * * *");
                     System.out.println("* * * * *");
                     System.out.println("* * * * *");
                     break;
                 case 3:
                     System.out.println("3. Draw the rectangle");
                     System.out.println("* * * * *");
                     System.out.println("* * * * *");
                     System.out.println("* * * * *");
                 case 0:
                     System.exit(0);
                 default:
                     System.out.println("No choice");
                     break;


             }
        }
    }
}
