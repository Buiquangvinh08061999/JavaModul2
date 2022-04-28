package Deploy_interface_Comparator;


public class Circle extends Shape{
    public double radius = 1.0;

    public Circle(){
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

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius+ ", which is a  subclass of "
                + super.toString();

    }
}
