package Deploy_interface_Resizeable;

public class Circle extends Shape implements Resizeable{
    public double radius = 1.0;

    public Circle() {
    }
    public Circle(double radius) {
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
    public  double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() + ", which is a  subclass of "
                + super.toString();
    }


    @Override
    public void resize(double percent) {
        radius = radius * Math.sqrt(percent);
    }
}
