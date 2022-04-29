package Deploy_interface_Resizeable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(4);
        System.out.println("Diện tích của hình tròn ban đầu là: " + ((Circle) shapes[0]).getArea());
        ((Circle) shapes[0]).resize(3);


        shapes[1] = new Rectangle(5, 8);
        System.out.println("Diện tích hình chữ nhật ban đầu là: " + ((Rectangle) shapes[1]).getArea());
        ((Rectangle) shapes[1]).resize(5);

        shapes[2] = new Square(5);
        System.out.println("Diện tích hình vuông ban đầu là : " + ((Square) shapes[2]).getArea());
        ((Square) shapes[2]).resize(4);

        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Circle) {
                System.out.printf("Diện tích hình tròn sau khi tăng kích thước là:%.2f \n", ((Circle) shapes[i]).getArea());
            }

           else if (shapes[i] instanceof Rectangle && !(shapes[i] instanceof Square)) {
                System.out.printf("Diện tích hình chữ nhật sau khi tăng kích thước là:%.2f \n", ((Rectangle) shapes[i]).getArea());

            } else {
                System.out.printf("Diện tích hình vuông sau khi tăng kích thước là:%.2f ", ((Square) shapes[i]).getArea());
            }

        }
    }
}

