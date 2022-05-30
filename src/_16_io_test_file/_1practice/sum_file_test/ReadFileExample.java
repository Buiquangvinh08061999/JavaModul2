package _16_io_test_file._1practice.sum_file_test;
import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void readFile(String path){
        try {
            File file = new File(path);

            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(path));

            int sum = 0;
            String line = "";
            while ((line = br.readLine()) !=null){
                System.out.println(line);
                sum+=Integer.parseInt(line);
            }

            br.close();
            System.out.println("Tổng là: " + sum);

        }catch (Exception o){
            System.out.println("File lỗi");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dẫn file");
        String path = scanner.nextLine();

        ReadFileExample read = new ReadFileExample();
        read.readFile(path);
    }
}

