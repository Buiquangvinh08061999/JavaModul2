package WEEK1.BasicWEEK1;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Nhập sô nguyên muốn đọc: ");
        number = sc.nextInt();

        int number1 = number / 100; /*Lấy số từ 1 đến 9*/
        int number2 = number % 10;  /*Lấy số từ 10 đến 19*/
        int number3 = number % 100 / 10; /*Lấy số từ 20 30 40 đến 90 */


        String firt = "";
        String second = "";
        String third = "";


        switch (number1) {
            case 1:
                firt = "One";
                break;
            case 2:
                firt = "Two";
                break;
            case 3:
                firt = "Three";
                break;
            case 4:
                firt = "Four";
                break;
            case 5:
                firt = "Five";
                break;
            case 6:
                firt = "Six";
                break;
            case 7:
                firt = "Seven";
                break;
            case 8:
                firt = "Egiht";
                break;
            case 9:
                firt = "Nine";
                break;
        }
        switch (number2) {
            case 0:
                second = "ten";
                break;
            case 1:
                second = "eleven";
                break;
            case 2:
                second = "twelve";
                break;
            case 3:
                second = "thirteen";
                break;
            case 4:
                second = "fourteen";
                break;
            case 5:
                second = "fifteen";
                break;
            case 6:
                second = "sixteen";
                break;
            case 7:
                second = "seventeen";
                break;
            case 8:
                second = "eightten";
                break;
            case 9:
                second = "nineteen";
                break;
        }
        switch (number3) {
            case 2:
                third = "twenty";
                break;
            case 3:
                third  = "thirty";
                break;
            case 4:
                third = "forty";
                break;
            case 5:
                third = "fifty";
                break;
            case 6:
                third  = "sixty";
                break;
            case 7:
                third  = "seventy";
                break;
            case 8:
                third  = "eighty";
                break;
            case 9:
                third  = "ninety";
                break;
        }

        if (number< 0){
            System.out.println("Không được nhập số âm");
        }
        if(number1 >0 && number1<10){
            System.out.println(firt);
        }
        if (number < 20){
            System.out.println(second);
        }



//        switch (status) {
//            case 1:
//                System.out.println("So nay khong thuoc khoang cho phep. Vui long nhap lai so khac!");
//                break;
//            case 2:
//                System.out.println(second);
//                break;
//            case 3:
//                System.out.println(second + '-' + second);
//                break;
//            case 4:
//                if (number2 == 0) {
//                    if (number3 == 0) {
//                        System.out.println(firt + " hundred ");
//                    } else {
//                        System.out.println(firt + " hundred and " + second);
//                    }
//                } else {
//                    if (number2 == 1) {
//                        System.out.println(firt + " hundred and " + second);
//                    } else {
//                        System.out.println(firt + " hundred and " + second + '-' + second);
//                    }
//                }
//                break;
//            default:
//                System.out.println("So nay khong thuoc khoang cho phep. Vui long nhap lai so khac!");
//                break;
//        }


//        if (number2 != 1) {
//            switch (number3) {
//                case 0:
//                    second = "";
//                    break;
//                case 1:
//                    second = "one";
//                    break;
//                case 2:
//                    second = "two";
//                    break;
//                case 3:
//                    second = "three";
//                    break;
//                case 4:
//                    second = "four";
//                    break;
//                case 5:
//                    second = "five";
//                    break;
//                case 6:
//                    second = "six";
//                    break;
//                case 7:
//                    second = "seven";
//                    break;
//                case 8:
//                    second = "eight";
//                    break;
//                case 9:
//                    second = "nine";
//                    break;
//            }
//        }
//        int status = number < 0 ? 1 : number < 20 ? 2 : number < 100 ? 3 : number < 1000 ? 4 : 5;
//        switch (status) {
//            case 1:
//                System.out.println("So nay khong thuoc khoang cho phep. Vui long nhap lai so khac!");
//                break;
//            case 2:
//                System.out.println(second);
//                break;
//            case 3:
//                System.out.println(second + '-' + second);
//                break;
//            case 4:
//                if (number2 == 0) {
//                    if (number3 == 0) {
//                        System.out.println(firt + " hundred ");
//                    } else {
//                        System.out.println(firt + " hundred and " + second);
//                    }
//                } else {
//                    if (number2 == 1) {
//                        System.out.println(firt + " hundred and " + second);
//                    } else {
//                        System.out.println(firt + " hundred and " + second + '-' + second);
//                    }
//                }
//                break;
//            default:
//                System.out.println("So nay khong thuoc khoang cho phep. Vui long nhap lai so khac!");
//                break;
//        }
    }


}

