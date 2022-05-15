package _16_io_test_file._1practice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;

public class FileReaderInPut {
    public static void main(String[] args) throws IOException {
        int ch;
        FileReader fileReader = null;

        try {
            fileReader = new FileReader("text");


        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        while ((ch=fileReader.read())!=-1) {
            System.out.println((char) ch);
        }

        fileReader.close();
        }
    }

