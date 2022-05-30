package homework;

import homework.services.impl.Studentimpl;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public void mainMeNu(){
        int choice=0;
        while (true){
            System.out.println("Chương trình quản lí");
            System.out.println("1.Teacher");
            System.out.println("2.Student");
            System.out.println("0.Thoát chương trình");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            }catch (Exception e){
                System.out.println("Nhập sai định dạng");
            }
            switch (choice){
                case 1:
                    break;
                case 2:
                    Student();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập sai");
                    break;
            }
        }
    }

    public void Teacher(){

        int choice =0;
        while (true){
            System.out.println("Quản lí giáo viên");
            System.out.println("1.Add ");
            System.out.println("2.Xóa theo id");
            System.out.println("3.Hiển thị ");
            System.out.println("4.Tìm kiếm theo tên ");
            System.out.println("0. Để thoát");
            try {
               choice = Integer.parseInt(scanner.nextLine());
            }catch (Exception o){
                System.out.println("Nhập sai");
            }
            switch (choice){
                case 1:

                case 2:

                case 3:

                case 4:
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập sai");
                    break;
            }
        }
    }

    public void Student(){
        Studentimpl student = new Studentimpl();
        int choice=0;
        while (true) {
            System.out.println("Quản lí học sinh");
            System.out.println("1.Add ");
            System.out.println("2.Xóa theo id");
            System.out.println("3.Hiển thị ");
            System.out.println("4.Tìm kiếm theo tên ");
            System.out.println("0. Để thoát");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception o) {
                System.out.println("Nhập sai");
            }
            switch (choice){
                case 1:
                    student.add();
                    break;
                case 2:

                case 3:
                    student.display();
                    break;
                case 4:

                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập sai");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.mainMeNu();
    }




}

