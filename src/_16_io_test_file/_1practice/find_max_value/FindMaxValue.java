package _16_io_test_file._1practice.find_max_value;

import java.util.ArrayList;
import java.util.List;

public class FindMaxValue {
    public static int finMax(List<Integer> number){
       int max = number.get(0);
       for (int i = 0; i < number.size();i++){
           if(number.get(i) > max){
               max = number.get(i);
           }
       }
       return max;
    }


    public static void main(String[] args) {
        ReadAndWriteFile read = new ReadAndWriteFile();
        List<Integer> number = read.readFile("_16_io_test_file/_1practice/find_max_value/number.txt");

        int max = finMax(number);
        read.writeFile("_16_io_test_file/_1practice/find_max_value/numbermax.txt", max);
    }
}
