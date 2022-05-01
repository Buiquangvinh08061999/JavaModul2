package LearnJaVa.OOPBasic.JAMES_OOP_CODEGYM.Inheritance_kethua;

public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle circle =  new Circle(1);
        circle.setFilled("Red");
        System.out.println("A Circle: " + circle.toString());
        System.out.println("Bán kính hình tròn là: " + circle.getRadius());
        System.out.println("Diện tích hình tròn là: " + circle.getArea());
        System.out.println("Chu vi hình tròn là: " + circle.getPerimeter());
        System.out.println("Tổng Diameter radius* 2 là: " + circle.getDiameter());
        System.out.println("");


        Rectangle rectangle = new Rectangle(2,4);
        rectangle.setFilled("Yellow");
        System.out.println("A Rectangle : " + rectangle.toString());
        System.out.printf("width là: %f  height là: %f \n",rectangle.getWidth(),rectangle.getHeight());
        System.out.println("Diện tích hình chữ nhật là: " + rectangle.getArea());
        System.out.println("Chu vi hình chữ nhật là: " + rectangle.getPerimeter());
        rectangle.mau();



    }
}
