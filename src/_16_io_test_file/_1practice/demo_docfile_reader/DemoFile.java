package _16_io_test_file._1practice.demo_docfile_reader;

import java.io.*;

public class DemoFile {
    public static void main(String[] args) throws IOException {
        File file = new File("_16_io_test_file/_1practice/demo_docfile_reader/demo.txt");
        InputStream  inputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        String line ="";
        while ((line = reader.readLine())!=null){
            System.out.println(line);
        }
    }
}
