import java.util.Scanner;

public class Main3tinhdientich {
    public static void main(String[] args) {
        float width; // Nhập chiều rộng
        float height; // Nhập chiều dài

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = scanner.nextFloat();

        System.out.println("Enter height: ");
        height = scanner.nextFloat();

        float S = width * height;
        System.out.println("Diện tích là: " + S);





    }
}
