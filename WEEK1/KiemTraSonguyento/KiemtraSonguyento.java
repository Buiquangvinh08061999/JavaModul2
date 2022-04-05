package KiemTraSonguyento;

import java.util.Scanner;

public class KiemtraSonguyento {
    public static void main(String[] args) {
        int n;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ban nhap n: ");
        n = sc.nextInt();
        if(n<2){
            System.out.println(n+"khong phai la so nguyen to");
        }else {
            for (int i =2; i<= Math.sqrt(n); i++){
                if (n%i ==0){
                    flag= false;
                    break;
                }
            }
        }
        if(flag){
            System.out.println(n+" la so nguyen to");
        }else{
            System.out.println(n+" khong phai la so nguyen to nhe");
        }



    }
}
