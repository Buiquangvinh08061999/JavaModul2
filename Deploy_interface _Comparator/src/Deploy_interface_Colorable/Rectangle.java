package Deploy_interface_Colorable;

public class Rectangle extends Shape{
    private double width =1.0;
    private double lenth =1.0;

    public Rectangle(){
    }

    public Rectangle(double width, double lenth) {
        this.width = width;
        this.lenth = lenth;
    }

    public Rectangle(String color, boolean filled, double width, double lenth) {
        super(color, filled);
        this.width = width;
        this.lenth = lenth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenth() {
        return lenth;
    }

    public void setLenth(double lenth) {
        this.lenth = lenth;
    }

    public double getArea(){
        return width * this.lenth;
    }

    public double getPerimeter(){
        return 2 * (width + this.lenth);
    }

    @Override
    public String toString() {
        return "Rectangle with width= "
                +getWidth()
                +"and lenth ="
                +getLenth()
                +", area is " + getArea()
                + super.toString();

    }
}
