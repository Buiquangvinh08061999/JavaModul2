package _16_io_test_file._1practice.find_max_value;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> number) {
        int max = number.get(0);

        for (int i = 0; i <number.size();i++ ){
            if(number.get(i) > max){
                max = number.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile  readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("_16_io_test_file/_1practice/find_max_value/number.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("_16_io_test_file/_1practice/find_max_value/numbermax.txt", maxValue);
    }
}
