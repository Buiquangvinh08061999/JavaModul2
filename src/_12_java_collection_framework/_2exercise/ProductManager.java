package _12_java_collection_framework._2exercise;


import java.util.*;
import java.util.Scanner;

public class ProductManager {
    public  Scanner scanner = new Scanner(System.in);

    public  List<Product> listProduct;

    public ProductManager(){
        listProduct = new ArrayList<>();
        listProduct.add(new Product(1,"a",11));
        listProduct.add(new Product(2, "B", 110));
        listProduct.add(new Product(3, "C", 100));
        listProduct.add(new Product(4, "C", 100));
    }

    public void displayProduct() {
        for (Product product : listProduct) {
            System.out.println(product.toString());
        }
    }

    public boolean checkID(int id) {
        for (Product product : listProduct) {
            if (id == product.getId()) {
                return true;
            }
        }
        return false;
    }

    public  void addProduct() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());

        if (checkID(id)) {
            System.out.println("ID " + id + " đã tồn tại vui lòng nhập lại!");
            addProduct();
            return;
        }
        if (!checkID(id)) {
            System.out.println("Nhập tên sp : ");
            String name = scanner.nextLine();
            System.out.println("Nhập giá : ");
            double price = Double.parseDouble(scanner.nextLine());

            listProduct.add(new Product(id, name, price));
            System.out.println("Đã thêm thành công");
        }
    }


    public  void changeProductId() {
        System.out.println("Nhập ID muốn sửa: ");
        int id = Integer.parseInt(scanner.nextLine());

        if (checkID(id)) {
            menuChangeProductID();
            for (Product product : listProduct){
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Nhập tên mới: ");
                        String name = scanner.nextLine();
                        product.setName(name);
                        break;
                    case 2:
                        double price = 0;
                        do {
                            try {
                                System.out.println("Nhập giá mới : ");
                                price = Double.parseDouble(scanner.nextLine());
                                product.setPrice(price);
                                while (price <= 0) {
                                    System.out.println("Giá không hợp lên vui lòng nhập lại!");
                                    price = Double.parseDouble(scanner.nextLine());
                                    product.setPrice(price);
                                }
                            } catch (Exception o) {
                                System.out.println("Yêu cầu nhập số nguyên! ");
                            }
                        } while (price <= 0);
                        break;
                    case 3:
                        System.out.println("Nhập tên mới: ");
                        String name1 = scanner.nextLine();
                        System.out.println("Nhập giá mới : ");
                        double price1 = Double.parseDouble(scanner.nextLine());
                        product.setName(name1);
                        product.setPrice(price1);
                        break;
                    case 4:
                        changeProductId();
                        break;
                    case 5:
                        mainMenu();
                        break;
                    case 6:
                        System.exit(0);
                        break;
                }
                System.out.println("Sửa thành công: ");
                break;
            }
        }
        if (!checkID(id)) {
            System.out.println("Không có ID này, vui lòng nhập lại : ");
            changeProductId();
        }
    }

    public void menuChangeProductID() {
        System.out.println(" 1: Sửa Tên ");
        System.out.println(" 2: Sửa Giá ");
        System.out.println(" 3: Sửa tên và Giá ");
        System.out.println(" 4: Chọn lại ID muốn sửa ");
        System.out.println(" 5: Quay lại MeNu Chính");
        System.out.println(" 6: Thoát");

    }



    public  void removeProductId() {
        System.out.println("Nhập ID muốn xóa: ");
        int id = Integer.parseInt(scanner.nextLine());

        boolean flag = false;
        for (int i = 0; i < listProduct.size(); i++) {
            if (id == listProduct.get(i).getId()) {
                listProduct.remove(i);
                flag = true;
                System.out.println("Xóa theo id sản phẩm thành công, danh sách mới là: ! ");
                displayProduct();
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy ID này, vui lòng nhập lại ID: ");
            removeProductId();
        }
    }

    public  void searchProductName() {
        System.out.println("Nhập tên muốn tìm: ");
        String name = scanner.nextLine();

        List<Product> listSearch = new ArrayList<>();

        for (int i = 0; i < listProduct.size(); i++) {
            if(listProduct.get(i).getName().toLowerCase().contains(name)) {
                listSearch.add(listProduct.get(i));
            }
        }
        if (listSearch.isEmpty()) {
            System.out.println("Tên tìm kiếm không có vui lòng nhập lại");
            searchProductName();
        }
        System.out.println("Danh sách sản phẩm tìm kiếm được : ");
        for (Product product : listSearch) {
            System.out.println(product.toString());
        }
    }


    public  void ascending() {
        listProduct.sort(new ProductAscending());
        displayProduct();
    }

    public void decrease() {
        listProduct.sort(new ProductDecrease());
        displayProduct();
    }


    public  void mainMenu() {
        do {
            showMenu();
            System.out.println("Chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
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
        } while (true);
    }

    public void showMenu() {
        System.out.println("--------------Enter your choice1--------------");
        System.out.println("1. Hiển thị danh sách sản phẩm");
        System.out.println("2. Thêm sản phẩm mới");
        System.out.println("3. Sửa thông tin sản phẩm theo id");
        System.out.println("4. Xoá sản phẩm theo id");
        System.out.println("5. Tìm kiếm sản phẩm theo tên");
        System.out.println("6. Sắp xếp sản phẩm tăng dần");
        System.out.println("7. Sắp xếp sản phẩm giảm dần");
        System.out.println("8. Exit");
    }
}
