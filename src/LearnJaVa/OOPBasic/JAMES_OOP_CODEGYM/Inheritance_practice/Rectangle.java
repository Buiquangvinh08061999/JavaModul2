package LearnJaVa.OOPBasic.JAMES_OOP_CODEGYM.Inheritance_practice;

public class Rectangle extends Shape{
    public double width = 1.0;
    public double length = 1.0;
    public Rectangle(){
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length =length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return this.width * this.length;
    }
    public double getPerimeter(){
        return (this.width + this.length) *2;
    }
    public String toString(){
        return "A Rectangle with width = " + getWidth() +" and " +
                " lenth =" + getLength() + " which is a subclass of " + super.toString();
    }
}
