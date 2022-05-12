package _12_java_collection_framework._1practice;
import java.util.*;
public class MainStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Thiện",20,"Huế");
        Student student2 = new Student("Phôn",19,"Huế");
        Student student3 = new Student("Phước",25,"Huế");

        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);

        for (Map.Entry<Integer,Student> student : studentMap.entrySet()) {/*Duyệt vòng for theo Entry*/
            System.out.println(student.toString());
        }

        System.out.println("------Set----------");
        Set<Student>  students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for (Student set : students){
            System.out.println(set.toString());
        }


    }
}
