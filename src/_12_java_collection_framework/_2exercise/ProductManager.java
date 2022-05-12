package _12_java_collection_framework._2exercise;


import java.util.*;
import java.util.Scanner;

public class ProductManager {
    public static Scanner scanner = new Scanner(System.in);

    public static List<Product> listProduct = new ArrayList<>();

    public static void main(String[] args) {
        listProduct.add(new Product(1,"A",100));
        listProduct.add(new Product(2,"B",110));
        listProduct.add(new Product(3,"C",100));
        listProduct.add(new Product(4,"C",100));

    mainMenu();
    }
    public static void displayProduct(){
        for (Product product : listProduct){
            System.out.println(product.toString());
        }
    }

    public static void addProduct(){
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sp: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá: ");
        double price = Double.parseDouble(scanner.nextLine());

        boolean flag = true;
        for (int i = 0; i < listProduct.size();i++){
            if (id == listProduct.get(i).getId()){
                System.out.println("Trùng ID vui lòng nhập lại");
                flag = false;
                addProduct();
                break;
            }
        }
        if (flag){
            listProduct.add(new Product(id,name,price));
            System.out.println("Đã thêm thành công");
        }
    }

    public static void changeProductId(){
        System.out.println("Nhập ID muốn sửa: ");
        int id = Integer.parseInt(scanner.nextLine());

        boolean flag = false;
        for (int i = 0 ; i < listProduct.size();i++){
            if(id == listProduct.get(i).getId()){
                System.out.println("Nhập tên mới: ");
                String name = scanner.nextLine();
                System.out.println("Nhập giá mới : ");
                double price = Double.parseDouble(scanner.nextLine());
                listProduct.get(i).setName(name);
                listProduct.get(i).setPrice(price);
                flag = true;
                System.out.println("Sửa thành công: ");
                break;
            }
        }
        if(!flag){
            System.out.println("Không có ID này, vui lòng nhập lại : ");
            changeProductId();
        }
    }

    public static void removeProductId(){
        System.out.println("Nhập ID muốn xóa: ");
        int id = Integer.parseInt(scanner.nextLine());

        boolean flag =false;
        for (int i = 0; i< listProduct.size();i++){
            if(id == listProduct.get(i).getId()){
                listProduct.remove(i);
                flag = true;
                System.out.println("Xóa theo id sản phẩm thành công, danh sách mới là: ! ");
                displayProduct();
            }
        }
        if(!flag){
            System.out.println("Không tìm thấy ID này, vui lòng nhập lại ID: ");
            removeProductId();
        }
    }

    public static void searchProductName(){
        System.out.println("Nhập tên muốn tìm: ");
        String name = scanner.nextLine();

        List<Product> listSearch = new ArrayList<>();
        for (int i = 0 ; i< listProduct.size(); i++){
            if (listProduct.get(i).getName().contains(name)){
                listSearch.add(listProduct.get(i));
            }
        }
        if (listSearch.isEmpty()) {
            System.out.println("không có sản phẩm như tên tìm kiếm");
            searchProductName();
        }
        System.out.println("Danh sách sản phẩm tìm kiếm được : ");
        for (Product product : listSearch) {
            System.out.println(product.toString());
        }

    }

    public static void  ascending(){
        listProduct.sort(new ProductAscending());
        displayProduct();
    }

    public static void decrease(){
        listProduct.sort(new ProductDecrease());
        displayProduct();
    }



    public static void mainMenu(){
        do {
            showMenu();
            System.out.println("Chọn: ");
            int choice =Integer.parseInt(scanner.nextLine());
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
                    break;
                case 5:
                    searchProductName();
                    break;
                case 6:
                    ascending();
                    break;
                case 7:
                    decrease();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này: ");
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
        System.out.println("6. Sắp xếp sản phẩm tăng dần");
        System.out.println("7. Sắp xếp sản phẩm giảm dần");
        System.out.println("8. Exit");
    }
}
