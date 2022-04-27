package Inheritance_practiceBaiTap.Shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double side1, side2, side3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập độ dài 3 cạnh của tam giác");
        side1 = sc.nextDouble();
        side2 = sc.nextDouble();
        side3 = sc.nextDouble();


        Triangle triangle = new Triangle("Red",false,side1,side2,side3);
        System.out.println(triangle);

        System.out.println("Diện tích của tam giác là: " + triangle.getArea());
        System.out.println("Chu vi của tam giác là: " + triangle.getPerimeter());
    }
}
