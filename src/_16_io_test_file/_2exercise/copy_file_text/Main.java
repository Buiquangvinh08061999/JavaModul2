package _16_io_test_file._2exercise.copy_file_text;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadAndWriteFile2 readAndWriteFile2 = new ReadAndWriteFile2();
        List<String> str = readAndWriteFile2.readFile("_16_io_test_file/_2exercise/copy_file_text/origin.txt");
        readAndWriteFile2.coppyFile("_16_io_test_file/_2exercise/copy_file_text/coppy.txt",str);
    }
}
