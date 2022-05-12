package _12_java_collection_framework._1practice.sapxep_comparator_comparable;

import javax.sql.ConnectionPoolDataSource;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Bam", 35, "HN");
        Student student = new Student("Aaen", 5, "HT");
        Student student2 = new Student("Cnh", 10, "HT" );
        Student student3 = new Student("Dung", 5, "HT" );

        List<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);

        System.out.println("Sắp xếp theo tên(Name= chuỗi)");
        Collections.sort(list);
        for (Student str : list){
            System.out.println(str.toString());
        }

        System.out.println("Tăng dần theo tuổi(Age = double)");
        list.sort(new StudentAscending_Age());
        for (Student age : list){
            System.out.println(age.toString());
        }


    }
}
