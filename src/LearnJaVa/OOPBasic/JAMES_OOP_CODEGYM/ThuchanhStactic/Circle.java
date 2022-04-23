package LearnJaVa.OOPBasic.JAMES_OOP_CODEGYM.ThuchanhStactic;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public  Circle(){
    }
    public Circle (double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI* radius* radius;
    }

    public static void main(String[] args) {
        Circle cir1 = new Circle(10);

        System.out.println(cir1.getRadius());
        System.out.printf("Dien tich la: %f ", cir1.getArea());
    }
}
