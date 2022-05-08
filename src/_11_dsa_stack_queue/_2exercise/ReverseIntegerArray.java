package _11_dsa_stack_queue._2exercise;

import java.util.Stack;

public class ReverseIntegerArray {
    public static void main(String[] args) {
        Stack<Integer> stackInteger = new Stack<>();
        int[] array = {1, 3, 7, 9, 11, 12};

        System.out.println("Before reverse: ");
        for (Integer i : array){
            System.out.println(i);
            stackInteger.push(i);
        }
        System.out.println("\nAfter reverse: ");
        for (Integer i : array){
            i = stackInteger.pop();
            System.out.println(i);
        }

        /*Đảo ngược chuỗi*/
        Stack<String> stackString= new Stack<>();

        String str ="abcd fght kiot";
        String[] array1 = str.split(" ");

        System.out.println("Trước khi đảo ngược: ");
        for (String i : array1){
            System.out.println(i);
            stackString.push(i);
        }
        System.out.println("Sau khi đảo ngược là: ");
        for (String i : array1){
            i = stackString.pop();
            System.out.println(i);
        }










    }
}
