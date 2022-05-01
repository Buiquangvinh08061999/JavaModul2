package LearnJaVa.OOPBasic.JAMES_OOP_CODEGYM.Inheritance_kethua;

public class Circle extends  Geometric{
        /*Đã có tất cả thuộc tính của lớp cha Geometric*/
    private  double radius;
    public Circle(){
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, String filled){
        super(color,filled);
        this.radius = radius;

    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return (radius * radius) * Math.PI;
    }
    public double getPerimeter(){
        return (radius * 2 )* Math.PI;
    }
    public double getDiameter(){
        return radius *2;
    }

    public  void printCircle(){
        System.out.println("Hình tròn màu " + getColor()+"Với bán kính được tạo là: " + radius);
    }
}
