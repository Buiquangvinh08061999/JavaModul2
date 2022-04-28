package Deploy_interface_Comparable;

public abstract class Cirle extends Shape{
    public double radius = 1.0;
    public Cirle(){
    }
    public Cirle(double radius) {
        this.radius = radius;
    }

    public Cirle(String color, boolean filled, double radius) {
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
        return radius * radius * Math.PI;
    }
    public double getPremeter(){
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Cirle{" +
                "radius=" + radius +
                '}';
    }
}
