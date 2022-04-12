package WEEK1.Prime;

import java.util.Scanner;

public class Prime2 {
    public static void main(String[] args) {
        int n;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số n:");
        n = sc.nextInt();


        for(int i = 2; i<= n-1;i++){
            if(n%i ==0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println(n+" là số nguyên tố");
        }else{
            System.out.println(n+" không phải là số nguyên tố");
        }
    }
}
