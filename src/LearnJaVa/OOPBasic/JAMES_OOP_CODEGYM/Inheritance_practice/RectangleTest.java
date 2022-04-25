package LearnJaVa.OOPBasic.JAMES_OOP_CODEGYM.Inheritance_practice;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(10,10);
        System.out.println(rectangle);

        rectangle = new Rectangle("BLUE", false, 10,10);
        System.out.println(rectangle);

//        rectangle.getArea();
        System.out.println("Diện tích là: " + rectangle.getArea());
        System.out.println("Chu vi là: " + rectangle.getPerimeter());
    }
}
