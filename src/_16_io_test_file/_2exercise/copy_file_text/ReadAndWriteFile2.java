package _16_io_test_file._2exercise.copy_file_text;

import java.io.*;
import java.util.*;

public class ReadAndWriteFile2 {
    public List<String> readFile(String path) {
        List<String> str = new ArrayList<>();

        try {
            File file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line = "";
            while ((line = br.readLine()) != null) {
                str.add(line);
            }
            br.close();

        } catch (Exception e) {
            System.out.println("File lỗi");
        }
        System.out.println("đọc file thành công");
        return str;
    }


    public void coppyFile(String path, List<String> str){
        try {
            FileWriter file = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(file);

            for (String element : str){
                bw.write(element+ "\n");
            }
            bw.close();

        }catch (Exception e){
            System.out.println("File lỗi");
        }
        System.out.println("Coppy file thành công");
    }

    public static void main(String[] args) {
        ReadAndWriteFile2 read = new ReadAndWriteFile2();
        List<String> str = read.readFile("_16_io_test_file/_2exercise/copy_file_text/origin.txt");
        read.coppyFile("_16_io_test_file/_2exercise/copy_file_text/coppy.txt",str);
    }
}

