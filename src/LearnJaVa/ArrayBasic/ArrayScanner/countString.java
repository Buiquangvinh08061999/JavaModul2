package LearnJaVa.ArrayBasic.ArrayScanner;


import java.util.Scanner;

public class countString {
    public static void main(String[] args) {
        //Bài tập đếm kí tự xuất hiện trong chuổi ,

        Scanner sc =new Scanner(System.in);
        String str ="Buiquangvvvvinh";
        int strlenth = str.length();
        char tim='v';


        int count =0;
        for (int i = 0; i < strlenth; i++){
            if(str.charAt(i) == tim){
                count++;
            }
        }
        System.out.println("Tổng kí tự  " +tim+  " có trong chuỗi là: " + count + " lần");

    }
}
