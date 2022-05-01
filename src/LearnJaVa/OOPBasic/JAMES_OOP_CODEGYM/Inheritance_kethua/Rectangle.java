package LearnJaVa.OOPBasic.JAMES_OOP_CODEGYM.Inheritance_kethua;

public class Rectangle extends Geometric{
    private double width ;
    private double height;
    public Rectangle(){
    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public  Rectangle(String color, String filled, double width, double height){
        super(color,filled);
        this.width = width;
        this.height = height;

    }
    public  void  mau(){
        System.out.println(getColor() + getFilled());
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public  double getArea(){
        return width * height;
    }
    public  double getPerimeter(){
        return (width+height) *2;
    }
}
