package _16_io_test_file._1practice.demo_ghifile_write;

import java.io.*;
public class DemoFile {
    public static void main(String[] args) throws IOException {
        String[] array = new String[3];
        array[0] = "DELL";
        array[1] = "Macbook";
        array[2] = "HP";
        File file = new File("_16_io_test_file/_1practice/demo_ghifile_write/mt.txt");

        OutputStream outputStream = new FileOutputStream(file);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);

        for (String item : array){
            outputStreamWriter.write(item + "");
        }
        /*Đang nằm trong outputStreamWriter
        Sử dụng flush() Xả ra tất cả đổ vào file mt.txt*/

        outputStreamWriter.flush();
    }

    //Tạo file , đưa nó vào dòng chảy, tạo Writer để ghi, và duyệt mảng để in ra vào file mt.txt
}
