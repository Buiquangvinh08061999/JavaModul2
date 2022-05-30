package _11_dsa_stack_queue._2exercise;

import java.util.Scanner;
import java.util.TreeMap;

public class CountStringMap {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhập vào chuỗi: ");
        String str = scanner.nextLine().toLowerCase();

        String[] arrayStr = str.split(" "); /*tách chuỗi nhập vào*/

        TreeMap<String, Integer> treeMap = new TreeMap<>();

        for (int i = 0 ; i < arrayStr.length;i++){
          if(treeMap.containsKey(arrayStr[i])){
                treeMap.put(arrayStr[i], treeMap.get(arrayStr[i] + 1));

          }else {
                treeMap.put(arrayStr[i], 1);
          }
        }
        System.out.println(treeMap);
    }
}
