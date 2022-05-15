package _16_io_test_file._1practice.sum_file_test;
import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath){
        try {
            //Đọc file theo đường dẫn
            File file = new File(filePath);

            //Kiểm tra nếu file không tồn tại thì ném ra ngoại lệ.
            if(!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader docfile = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = docfile.readLine())!=null){
                System.out.println(line);
                sum  += Integer.parseInt(line);
            }
            docfile.close();

            //Hiển thị ra màn hình tổng các số nguyên trong file
            System.out.println("Tổng = " + sum);

        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Nhập đường dẫn file: ");
        String path = scanner.nextLine();

        ReadFileExample docfile = new ReadFileExample();
        docfile.readFileText(path);
    }
}

