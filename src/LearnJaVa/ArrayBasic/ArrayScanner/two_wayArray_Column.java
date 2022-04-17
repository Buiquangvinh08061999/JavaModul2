package LearnJaVa.ArrayBasic.ArrayScanner;

import java.util.Arrays;
import java.util.Scanner;

public class two_wayArray_Column {
    public static void main(String[] args) {
        int size1, size2,min =1,max =8,choice;
        int [][] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập 1 để Bắt Đầu chương trình:");
            System.out.println("Nhập 0 để Kết Thúc chương trình:");
            choice = sc.nextInt();
            switch (choice){
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("Nhập size (số hàng): ");
                    size1 = sc.nextInt();
                    System.out.println("Nhập size (số cột): ");
                    size2 = sc.nextInt();
                    if(size1 <=1 && size2 <=1){
                        System.out.println("Yêu cầu người dùng nhập số hàng và số cột >1");
                    }
                    if(size1 >1 && size2>1 ){
                        array = new int[size1][size2];
                        for (int i = 0; i < array.length;i++){
                            for (int j =0; j < array[i].length;j++){
                                int random = (int) Math.floor(Math.random()*(max - min +1) +min);
                                array[i][j] = random;
                            }
                        }
                        System.out.println("Mảng sau khi random ngẫu nhiên là: " + Arrays.deepToString(array));
                        //Tính tổng cột bất kì từ người nhập vào;
                        System.out.println("Mời bạn nhập vào số cột cần tính: ");
                        int number = sc.nextInt();
                        int tolal=0;
                        for (int i = 0 ; i < array.length;i++){
                            for(int  j = 0; j < array[i].length;j++){
                                if(j == number){
                                    tolal+= array[i][j];
                                }
                            }
                        }
                        System.out.println("Tổng cột " + number+ " là: " + tolal);
                    }
                    break;
                default:
                    System.out.println("No choice");
                    break;
            }
        }while (true);
    }
}
