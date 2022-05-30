package _20_thi_thuchanh.view;

import _20_thi_thuchanh.model.ManagePhoneList;
import _20_thi_thuchanh.services.IDirectoryService;
import _20_thi_thuchanh.services.DirectoryService;
import _20_thi_thuchanh.utils.CSVUtils;
import _20_thi_thuchanh.utils.Validation;
import java.util.*;
import java.util.Scanner;

public class DirectoryView {
    public Scanner scanner = new Scanner(System.in);
    private static DirectoryService directoryService = new DirectoryService();
    public final static  String path ="_20_thi_thuchanh/contacts.csv";


    public void disPlay(){
        List<ManagePhoneList> mpList = directoryService.findAll();
        boolean flag = false;
        System.out.println("---------------------------------------Danh sách điện thoại---------------------------------");
        System.out.printf("%-10s %-20s %-20s %-20s %-20s %-20s \n", "Tên", "Tuổi", "SĐT", "Giới tính","Địa chỉ","Email");
        for (ManagePhoneList newmpList : mpList){
            System.out.printf("%-10s %-20s %-20s %-20s %-20s %-20s \n"
                            ,newmpList.getName()
                            ,newmpList.getAge()
                            ,newmpList.getNumberPhone()
                            ,newmpList.getGender()
                            ,newmpList.getAddress()
                            ,newmpList.getEmail()
            );
            return;
        }

        if(!flag){
            System.out.println("RỖng");
            return;
        }
    }

    public void add(){
        List<ManagePhoneList> mpList = directoryService.findAll();

        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = Integer.parseInt(scanner.nextLine());

        String number;
        while (true){
            System.out.println("Nhập SĐT");
            number= scanner.nextLine();
            if (Validation.isPhoneValid(number)){
                break;
            }else {
                System.out.println("\tKhông tồn tại số điện thoại này, hãy nhập lại:");
            }
        }
        System.out.println("Nhập giới tính");
        String gender = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        String email;
        while (true){
            System.out.println("Nhập email");
            email = scanner.nextLine();
            if(Validation.isEmailValid(email)){
                break;
            }else {
                System.out.println("Không tồn tại địa chỉ email này, hãy nhập lại:");
            }
        }

        ManagePhoneList newmpList = new ManagePhoneList(name,age,number,gender,address,email);
        directoryService.add(newmpList);
        System.out.println("Thêm thành công");
    }




    public void option(){
        mainMenu();
        int choice;
        choice = Integer.parseInt(scanner.nextLine());
        do {
               switch (choice) {
                   case 1:
                       disPlay();
                       break;
                   case 2:
                       add();
                       break;
                   case 3:
                       break;
                   case 4:
                       break;
                   case 5:
                       break;
                   case 6:
                       break;
                   case 7:
                       break;
                   case 8:
                       System.exit(0);
                       break;
                   default:
                       System.out.println("Nhập sai chức năng vui lòng nhập lại!");
                       break;
               }
        }while (choice!=0);
    }


    public void mainMenu() {
        System.out.println("\t---CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ---");
        System.out.println("\tChọn chức năng theo số (để tiếp tục)");
        System.out.println("1. Xem danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Tìm kiếm");
        System.out.println("6. Đọc từ file");
        System.out.println("7. Ghi vào file");
        System.out.println("8. Thoát\n");
        System.out.println("Chọn chức năng: \t");
    }


}
