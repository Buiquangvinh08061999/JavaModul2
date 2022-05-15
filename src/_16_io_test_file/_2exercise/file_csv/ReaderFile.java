package _16_io_test_file._2exercise.file_csv;

import java.io.*;
import java.util.*;
public class ReaderFile {
    public static void printList(List<Country> list) {
        for (Country country : list){
            System.out.printf("%-10s %-10s %-10s\n",country.getId(),country.getCode(),country.getName());
        }
//    }
    }
    public static void main(String[] args) throws IOException{
        List<Country> list = new ArrayList<>();
        File file = new File("_16_io_test_file/_2exercise/file_csv/test.csv");
        InputStream inputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        String line = "";
        while ((line = reader.readLine())!=null){
            list.add(new Country(line));
        }
        printList(list);
    }
}
