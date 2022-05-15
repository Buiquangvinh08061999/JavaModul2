package _12_java_collection_framework.cdgym.vinhbui.views;

import _12_java_collection_framework.cdgym.vinhbui.model.Product;
import _12_java_collection_framework.cdgym.vinhbui.services.IProductService;
import _12_java_collection_framework.cdgym.vinhbui.services.ProductService;

import java.util.Scanner;
import java.util.*;
public class ProductView {
    IProductService productService = new ProductService();
    public Scanner scanner=new Scanner(System.in);


    public void addProduct(){
        System.out.println("Nhập id sản phẩm:");
        int id = Integer.parseInt(scanner.nextLine());
        if(productService.exitsByID(id)){
            System.out.println("ID đã tồn tại ");
        }else {
            System.out.println("Nhập tên sản phẩm: ");
            String name = scanner.nextLine();
            System.out.println("Nhập giá: ");
            double price = Double.parseDouble(scanner.nextLine());

            productService.add(new Product(id,name,price));
//            Product product = new Product(id,name,price);
//            productService.addProduct(product);

        }
    }

    public void displayProduct(List<Product> products){
        System.out.println("---------------------------------------Product---------------------------------");
        System.out.printf("%-10s %-20s %-20s\n", "ID", "Tên Sản Phẩm", "Giá sản phẩm");

        for (Product product : products){
            System.out.printf("%-10d %-20s %-20s\n", product.getId(), product.getName(), product.getPrice());
        }
    }

    public void changeProductID(List<Product> products){
        System.out.println("Nhập ID muốn sửa:");
        int id = Integer.parseInt(scanner.nextLine());
        if(productService.exitsByID(id)) {
            for (Product product : products) {
                System.out.println("Nhập tên mới: ");
                String name = scanner.nextLine();
                product.setName(name);
                System.out.println("Nhập giá mới");
                double price = Double.parseDouble(scanner.nextLine());
                product.setPrice(price);
                System.out.println("Sửa thành công!");
                return;
            }
        }
        System.out.println("ID không tồn tại ");
    }


    public void removeProductID(){
        System.out.println("Nhập ID muốn Xóa:");
        int id = Integer.parseInt(scanner.nextLine());
        if(productService.exitsByID(id)){
            productService.removeProductByID(id);
            System.out.println("Xóa thành công");
            return;
        }
        System.out.println("ID không tồn tại ");
    }

    public void searchName(List<Product> products){
        System.out.println("Nhập tên muốn tìm");
        String name = scanner.nextLine();
        System.out.println("Từ khóa " + name + " tìm được trong danh sách là: ");
          for (Product product : products){
              if (productService.exitsByName(name)){
                  displayProduct(productService.searchProductByName(name));
                  return;
              }
          }
        System.out.println("không có trong danh sách!");
        }





    public void menuManager(){
        int choice;
        do {
            System.out.println("Menu Product Manager!!");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm theo id");
            System.out.println("3. Xoá sản phẩm theo id");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Hiển thị sản phẩm theo giá tiền tăng dần");
            System.out.println("7. Hiển thị sản phẩm theo giá tiền giảm dần ");
            System.out.println("0. Để thoát chương trình");
            choice =Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    addProduct();
                    break;
                case 2:
                    changeProductID(productService.findAll());
                    break;
                case 3:
                    removeProductID();
                    break;
                case 4:
                    displayProduct(productService.findAll());
                    break;
                case 5:
                   searchName(productService.findAll());
                    break;
                case 6:
                    displayProduct(productService.findAllByPriceASC());
                    break;
                case 7:
                    displayProduct(productService.findAllByPriceDESC());
                    break;
            }
        }while (choice != 0);
    }
}
