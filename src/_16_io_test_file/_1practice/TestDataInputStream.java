package _16_io_test_file._1practice;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class TestDataInputStream {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream(args[0]);
            DataInputStream din = new DataInputStream(fin);
            while (true){
                System.out.println(din.readInt());
            }
        }
        catch (EOFException e){
        }
        catch (IOException e ){
            e.printStackTrace();
        }
    }
}
