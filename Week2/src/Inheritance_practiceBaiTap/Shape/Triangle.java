package Inheritance_practiceBaiTap.Shape;

public class Triangle extends Shape{
    public double side1 = 1.0;
    public double side2 = 1.0;
    public double side3 = 1.0;
    private boolean isText = true;

    public Triangle(){
    }

    public Triangle(double side1, double side2, double side3) {
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            isText=true;
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }else {
            isText = false;
            System.out.println("Đây không phải là 3 cạnh cảu 1 tam giác");
        }
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            isText = true;
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }else {
            isText = false;
            System.out.println("Đây không phải là 3 cạnh cảu 1 tam giác");
        }

    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getArea(){
        if (isText){
            double p = getPerimeter()/2;
            return Math.sqrt(p*(p-side1) *(p-side2)*(p-side3));
        }
        return -1;
    }
    public double getPerimeter(){
        if (isText){
            return side1+side2+side3;
        }
        return -1;
    }

    @Override
    public String toString() {
      if(isText) {
          return "Triangle{color='" +
                  getColor() + "',filled=" + isFilled() +
                  ", side1=" + side1 +
                  ", side2=" + side2 +
                  ", side3=" + side3 +
                  '}';
      }
      return "Không phải là tam giác hợp";
    }
}
