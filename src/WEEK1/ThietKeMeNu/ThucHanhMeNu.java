package WEEK1.ThietKeMeNu;

import java.util.Scanner;

public class ThucHanhMeNu {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle: ");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right): ");
        System.out.println("3. Print isosceles triangle: ");
        System.out.println("4. Exit");
        System.out.println("Enter choice: ");
        while (true){
            choice = sc.nextInt();
            switch (choice){
                case 1:
//                  In hình chữ nhất 3 dòng 8 cột
                    for(int i = 0; i < 3; i ++){
                        for (int j = 0; j < 8; j ++){
                            System.out.print(" " + "*");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
//                  Tam giác 1 đến sao đều
                    for (int i = 1 ; i <=5;i++){
                        for (int j = 1; j<=i; j++){
                            System.out.print(" " + "*");
                        }
                        System.out.println("");
                    }
                    System.out.println("\n");

//                  Tam giác 5 đến 1 sao điều
                    for (int i = 5; i>=1; i--){
                        for (int j = 1 ; j <=i; j++){
                            System.out.print(" " + "*");
                        }
                        System.out.println("");
                    }
                    System.out.println("\n");


//                  Tam giác 5 đến 1 ngược
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <=i; j++) {
                            System.out.print(" ");
                    }
                        for (int j =i; j<=5;j++){
                            System.out.print("*");
                        }
                        System.out.println("");
                        }

//                  Tam giác 1 đến 5 sao ngược
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <=i; j++) {
                            System.out.print(" ");
                        }
                        for (int j =i; j<=5;j++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;

                case 3:
//                    In tam giác cân
                    for(int i = 0; i <=5;i++){
                        for(int j = 5-i; j>=0; j --){
                            System.out.print(" ");
                        }
                        for (int k=1; k<=i*2+1; k++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;

                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice");
                    break;

            }
        }
    }
}
