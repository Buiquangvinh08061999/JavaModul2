package LearnJaVa.OOPBasic.JAMES_OOP_CODEGYM.Inheritance_practiceBaiTap;

public class Circle {
    public  double radius;
    public  String color;
    public Circle(){
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return  (radius * radius) * Math.PI;
    }
    public double getPerimeter(){
        return (radius * 2) * Math.PI;
    }

    @Override
    public String toString() {
        return  "A Cricle with color of "
                +getColor()
                + " and "
                +getRadius();
    }


}
