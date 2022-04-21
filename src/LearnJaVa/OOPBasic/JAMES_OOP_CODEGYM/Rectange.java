package LearnJaVa.OOPBasic.JAMES_OOP_CODEGYM;

import java.util.Scanner;

public class Rectange {
    public double width;
    public double height;

    public Rectange() {
    }

    public Rectange(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }


    public String display() {
        return "Rectange{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap width va height");
        double width = sc.nextDouble();
        double height = sc.nextDouble();

        Rectange rtg = new Rectange(width,height);

        System.out.println("Dien tich hinh chu nha la: "+ rtg.getArea());

        System.out.println("Chu vi hinh chu nhat la: " + rtg.getPerimeter());

        System.out.println("Hiển thị width và height: " + rtg.display());
    }
}
