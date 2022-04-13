package WEEK1.StringAll;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringFormat {
    public static void main(String[] args) {
//        int a = 5;
//        System.out.printf("Thành tiền là : %d\n", a);
//
//        float b = 3.15f;
//        System.out.printf("Thành tiền là : %.5f\

        //Dùng %2d để thụt đầu vào 2 ô để in dòng chữ text không bị lệch;
//        for(int i = 0; i < 20; i++){
//            System.out.printf("%02d text \n", i);
//        }
        System.out.printf("%-12s  %s\n","Column 1","Column 2");
        System.out.printf("%-12.5f %.5f", 12.23429837482,9.10212023134);

//        Date now = new Date();
//        System.out.printf("Giờ hiện tại là : %s\n", now);
//
//        String newnow = DateFormat.getInstance().format(now);
//        System.out.printf("Date Format su dung getInstance(): %s\n ", newnow);
//
//
//        //Cách gọi ngày tháng năm theo ý muốn. gọi Kiểu dữ liệu :SimpleDateFormat;
//        SimpleDateFormat Simpleformat = new SimpleDateFormat("dd/MM/yyyy");
//        String fomattext = Simpleformat.format(now);
//        System.out.println("Format date " + fomattext);




    }
}
