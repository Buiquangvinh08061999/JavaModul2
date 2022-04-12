package WEEK1.Prime;

import java.util.Scanner;

public class PrimeNhoHon100 {
    public static void main(String[] args) {
//      Hiển thị số nguyên tố <100:
        boolean flag = true;
        for(int n = 2; n<=100;n++){
            flag = true;
            for (int j=2; j<=n-1;j++){
                if(n% j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.print(" " + n);
            }
        }
    }
}


