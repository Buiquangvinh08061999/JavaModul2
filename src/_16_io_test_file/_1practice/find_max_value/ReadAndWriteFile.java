package _16_io_test_file._1practice.find_max_value;

import java.util.*;
import java.io.*;


public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath){
        List<Integer> number = new ArrayList<>();
        try {
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader docfile = new BufferedReader(new FileReader(file));

            String line = "";
            while ((line = docfile.readLine())!=null){
                number.add(Integer.parseInt(line));
            }
            docfile.close();

        } catch (Exception e) {
            System.out.println("File lỗi");;
        }
        return number;
    }

    public void writeFile(String filePath, int max){
        try {
            FileWriter writer = new FileWriter(filePath,true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write("Giá trị lớn nhất là: " + max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
