package homework.services.impl;

import homework.services.Services;
import homework.model.Student;

import java.util.*;
import java.io.*;
import java.util.Scanner;

import homework.utils.ReadAndWriteFile;


public class Studentimpl implements Services {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Student> studentList;

    public static List<Student> getStudentList() {
        List<Student> studentList = new ArrayList<>();
        List<String[]> listStr = ReadAndWriteFile.readFile("homework/data/Student.csv");
        for (String[] item : listStr) {
            studentList.add(new Student(
                    Integer.parseInt(item[0]),
                    item[1],
                    Integer.parseInt(item[2]),
                    item[3],
                    Integer.parseInt(item[4])
            ));
        }
        return studentList;
    }

    @Override
    public void add() {
        studentList = getStudentList();
            int id = (int) (System.currentTimeMillis()/100000);

            System.out.println("Nhập Tên");
            String name = scanner.nextLine();
            System.out.println("Nhập tuổi");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập giới tính");
            String gender = scanner.nextLine();
            System.out.println("Nhập điểm môn toán");
            int math = Integer.parseInt(scanner.nextLine());

            studentList.add(new Student(id, name, age, gender, math));
            updateFile(studentList);
            System.out.println("Đã thêm thành công");

        }



    @Override
    public void remove() {

    }

    @Override
    public void display() {
        studentList = getStudentList();
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
    }

    @Override
    public void find() {

    }

    public static void updateFile(List<Student> studentList) {
        List<String> stringList = new ArrayList<>();
        for (Student item : studentList) {
            stringList.add(item.getLine());
        }
        ReadAndWriteFile.writeFile("homework/data/Student.csv", stringList);
    }


}
