package _12_java_collection_framework._2exercise.ProDuctManage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager_1 {
    public static Scanner scanner = new Scanner(System.in);

    public static List<Product_1> listProduct = new ArrayList<>();

    public static void main(String[] args) {
        listProduct.add(new Product_1(1,"A",11));
        listProduct.add(new Product_1(2,"B",12));
        listProduct.add(new Product_1(3,"C",13));

        mainMenu();
    }


    public static void displayProduct(){
        for (Product_1 product : listProduct){
            System.out.println(product.toString());
        }
    }

    public static void addProduct(){
        System.out.println("Nhập ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập Tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập Giá: ");
        double price = Double.parseDouble(scanner.nextLine());

        boolean flag = false;
        for (int i = 0 ; i < listProduct.size();i++){
            if(id == listProduct.get(i).getId()){
                System.out.println("ID đã tồn tại! Vui lòng nhập lại ID");
                flag = true;
                addProduct();
                break;
            }
        }
        if (!flag){
            listProduct.add(new Product_1(id,name,price));
            System.out.println("Thêm sản phẩm thành công!");
            mainMenu();
        }
    }


    public static void changeProductId(){
        System.out.println("Nhập ID muốn sửa: ");
        int id = Integer.parseInt(scanner.nextLine());

        boolean flag = false;
        for (int i = 0; i < listProduct.size();i++){
            if(id == listProduct.get(i).getId()){
                System.out.println("Nhập Tên Mới: ");
                String name = scanner.nextLine();
                System.out.println("Nhập Giá Mới : ");
                double price = Double.parseDouble(scanner.nextLine());
                listProduct.get(i).setName(name);
                listProduct.get(i).setPrice(price);
                flag = true;
                displayProduct();
            }
        }
        if(!flag) {
            System.out.println("Không có ID này");
        }
    }



    public static void removeProductId(){
        System.out.println("Nhập ID bạn muốn xóa");
        int id = Integer.parseInt(scanner.nextLine());

        boolean flag = false;
        for (int i = 0 ; i < listProduct.size();i++){
            if(id == listProduct.get(i).getId()){
                listProduct.remove(i);
                System.out.println("Đã xóa thành công");
                flag = true;
                mainMenu();
                break;
            }
        }
        if (!flag){
            System.out.println("Không tồn tại id này vui lòng nhập lại");
            System.out.println("Nhấn 1 để quay lại menu, 2 để tiếp tục chọn id muốn xóa");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    mainMenu();
                    break;
                case 2:
                    removeProductId();
                    break;
                default:
                    System.out.println("Không có lưa chọn này");
                    break;
            }
        }
    }

    public static void searchProductName(){
        System.out.println("Nhập Tên cần tìm: ");
        String name = scanner.nextLine();
        boolean flag = false;
        for (int i = 0 ; i < listProduct.size();i++){
            if(listProduct.get(i).getName().contains(name)){
                System.out.println(listProduct.get(i));
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("Không tồn tại tên này vui lòng nhập lại!");
            System.out.println("Nhấn 1 để quay lại menu, 2 để tiếp tục chọn tên muốn xóa");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    mainMenu();
                    break;
                case 2:
                    searchProductName();
                    break;
                default:
                    System.out.println("Không có tên này vui lòng nhập lại!");
                    searchProductName();
                    break;
            }
        }
    }



    public static void mainMenu(){
        do {
            showMenu();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    displayProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    changeProductId();
                    break;
                case 4:
                    removeProductId();
                case 5:
                    searchProductName();
                case 6:

                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có chức năng này");
                    break;
            }
        }while (true);
    }


    public static  void showMenu(){
        System.out.println("--------------Enter your choice1--------------");
        System.out.println("1. Hiển thị danh sách sản phẩm1");
        System.out.println("2. Thêm sản phẩm1");
        System.out.println("3. Sửa thông tin sản phẩm theo id");
        System.out.println("4. Xoá sản phẩm theo id");
        System.out.println("5. Tìm kiếm sản phẩm theo tên");
        System.out.println("6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
        System.out.println("7. Exit");
    }

}
