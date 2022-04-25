package LearnJaVa.OOPBasic.JAMES_OOP_CODEGYM.Inheritance_practice;

public class Circle extends Shape{
    public  double radius = 1.0;
    public Circle(){
    }
    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return  (radius * radius) * Math.PI;
    }
    public double getPerimeter(){
        return (radius * 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "A Rectangle with width =" + getRadius() +"which is a subclass of " + super.toString();
    }
}
