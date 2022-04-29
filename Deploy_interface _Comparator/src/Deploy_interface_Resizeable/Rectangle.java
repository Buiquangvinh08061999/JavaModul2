package Deploy_interface_Resizeable;

public class Rectangle extends Shape implements Resizeable {
    public  double width;
    public  double lenth;

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
        return width * lenth;
    }
    public  double getPerimeter(){
        return  (width+lenth) * 2;
    }

    @Override
    public String toString() {
        return "A Rectangle{" +
                "width=" + getWidth() +
                ", lenth=" + getLenth()+
                ", which is a  subclass of " +
                super.toString();

    }

    @Override
    public void resize(double percent) {
        width = width * Math.sqrt(percent);
        lenth = lenth * Math.sqrt(percent);
    }
}
