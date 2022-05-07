package _10_dsa_list.practice.practice_arraylist;
import java.util.ArrayList;
import java.util.Scanner;

public class arraylist1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = {10,5,8,3,4,12,15};
        int max =array[0];

        for (int i = 0 ; i < array.length;i++){
            if (array[i] > max){
                max = array[i];

            }
        }
        System.out.println("lon nhat la" + max);


    }
}
