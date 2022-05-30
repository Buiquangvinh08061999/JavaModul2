package _16_io_test_file._1practice.demo_ghifile_write;
import java.io.*;
public class GhiFile {
    public static void main(String[] args) {
        String[] array ={"Nguyen Van A","Nguyen Van B","Nguyen Van C"};

        try {
            FileWriter file = new FileWriter("_16_io_test_file/_1practice/demo_ghifile_write/data.txt");
            BufferedWriter bw = new BufferedWriter(file);
            for(String s : array){
                bw.write(s);
                bw.newLine();
            }
            bw.close();
            file.close();

        }catch (Exception e){
            System.out.println("File lỗi");
        }
    }
}
