package LearnJaVa.OOPBasic.JAMES_OOP_CODEGYM.Inheritance_practiceBaiTap;

public class Cylinder extends Circle{
    public double heigth;
    public Cylinder(){
    }
    public Cylinder(double heigth){
        this.heigth =heigth;
    }

    public Cylinder(double radius, String color, double heigth) {
        super(radius, color);
        this.heigth = heigth;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getVolume(){
        return getArea() * heigth;
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public String toString() {
        return  "A Cylinder with volume of " + getVolume()
                + " and " + super.toString();

    }
}
