package LearnJaVa.ArrayBasic.FindvalueinArray;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        //So sánh kiểu String xem có nằm trong mảng students không, và in ra vị trí
        String[] students = {"Vinh", "Top", "Vu", "Phi"};
        Scanner sc = new Scanner(System.in);
//
//        String findvalue;
        System.out.println("Nhập findvalue: ");
        String  findvalue = sc.nextLine();

        boolean flag = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(findvalue)) {
                System.out.println("từ khóa: " + findvalue + " nằm ở vị trí:" + i);
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println("Không tìm thấy từ :" + findvalue);
    }
}

