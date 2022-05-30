package _16_io_test_file._1practice.demo_ghifile_write;

import java.io.*;
public class DemoFile {
    public static void main(String[] args) throws IOException {
        String[] array = new String[3];
        array[0] = "DELL";
        array[1] = "Macbook";
        array[2] = "HP";

        File file = new File("_16_io_test_file/_1practice/demo_ghifile_write/mt.txt");

        OutputStream ops = new FileOutputStream(file);
        OutputStreamWriter opswriter = new OutputStreamWriter(ops);

        for (String s : array) {
            opswriter.write(s);
            opswriter.write("\n");
        }
        /*Đang nằm trong outputStreamWriter
        Sử dụng flush() Xả ra tất cả đổ vào file mt.txt*/
        opswriter.flush();
    }

    //Tạo file , đưa nó vào dòng chảy, tạo Writer để ghi, và duyệt mảng để in ra vào file mt.txt
}
