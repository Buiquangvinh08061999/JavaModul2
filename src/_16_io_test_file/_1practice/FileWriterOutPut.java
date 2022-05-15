package _16_io_test_file._1practice;

import java.io.IOException;

public class FileWriter {
    public static void main(String[] args) throws IOException {
        String str = "File";
        java.io.FileWriter fw = new java.io.FileWriter("output.txt");

        /*in ra 4 lần theo từng chữ cái File*/
        for (int i = 0 ; i < str.length();i++){
            fw.write(str.charAt(i));
            System.out.println("Viết thành công ");
        }
    }
}
