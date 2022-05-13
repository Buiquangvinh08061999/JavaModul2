package _15_exception_handling_and_debug._1practice.array_index_out_of_bounds_exeption;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Random random = new Random();

        Integer [] array = new Integer[100];
        System.out.println("Danh sách phần tử của mảng ");
        for (int i = 0 ; i < 100; i++){
            array[i] = random.nextInt(100);
            System.out.println(array[i] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] array = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = Integer.parseInt(scanner.nextLine());
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + array[x]);
        }catch (IndexOutOfBoundsException e){
            System.err.println("Chỉ số vượt qua giới hạn của mảng");
        }
    }
}
