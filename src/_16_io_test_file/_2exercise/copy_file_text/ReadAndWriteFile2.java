package _16_io_test_file._2exercise.copy_file_text;

import java.io.*;
import java.util.*;

public class ReadAndWriteFile2 {
    public List<String> readFile(String filePath) {

        List<String> str = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader docfile = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = docfile.readLine()) != null) {
                str.add(line);
            }

            docfile.close();
        }catch (Exception o ){
            System.out.println("File không tồn tại hoặc nội dung có lỗi");
        }
        System.out.println("Đọc têp và nhận giá trị hoàn tất");
        return str;
    }

    public void coppyFile(String filePath, List<String> str){
        try {
            FileWriter writer = new FileWriter(filePath,true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for(String elements: str){
                bufferedWriter.write(elements + "\n");

            }
            bufferedWriter.close();

        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Sao chép tệp hoàn tất");

    }
}
