package _16_io_test_file._1practice;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataOutPutStream {
    public static void main(String[] args) {
        int[] array = {2,4,6,8,10};
        try {
            FileOutputStream fout = new FileOutputStream(args[0]);
            DataOutputStream dout = new DataOutputStream(fout);
            for (int i = 0 ; i < array.length;i++){
                dout.writeInt(array[i]);
                dout.close();
            }
        }catch (IOException e ){
            e.printStackTrace();
        }
    }
}
