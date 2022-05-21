package _13_search_algorithm;

import java.util.LinkedList;
import java.util.Scanner;

public class Find_Biggest_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi");
        String string = scanner.nextLine();

        LinkedList<Character> max = new LinkedList<>();
        max.add(string.charAt(0));

        for (int i =1; i < string.length();i++){
            if(string.charAt(i) > max.getLast()){
                max.add(string.charAt(i));
            }
        }

        for(Character character : max){
            System.out.println(character);
        }

    }
}
