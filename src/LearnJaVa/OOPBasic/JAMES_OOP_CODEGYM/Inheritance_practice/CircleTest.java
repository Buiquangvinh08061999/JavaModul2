package LearnJaVa.OOPBasic.JAMES_OOP_CODEGYM.Inheritance_practice;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);


        circle = new Circle("Red", false, 3.5);
        System.out.println(circle);

        System.out.println("Diện tích là : " + circle.getArea());
        System.out.println("Chu vi là: " + circle.getPerimeter());
    }
}
