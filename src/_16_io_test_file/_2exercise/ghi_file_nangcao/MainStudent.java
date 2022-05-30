package _16_io_test_file._2exercise.ghi_file_nangcao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class MainStudent {
    public static void main(String[] args) {
        Student st1 = new Student("Vinh",18,8);
        Student st2 = new Student("Vinh",18,8);
        Student st3 = new Student("Vinh",20,8);
        Student st4 = new Student("Quang",18,8);
        List<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);

        try {
            FileWriter file = new FileWriter("_16_io_test_file/_2exercise/ghi_file_nangcao/student.txt");
            BufferedWriter bw = new BufferedWriter(file);

            for (Student o : list){
                bw.write(o.toString());
                bw.newLine();
            }
            bw.close();
            file.close();

        }catch (Exception e){

        }
    }
}
