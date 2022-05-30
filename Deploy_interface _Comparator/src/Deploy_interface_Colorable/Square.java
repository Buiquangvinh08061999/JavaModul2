package Deploy_interface_Colorable;

public class Square extends Shape implements Colorable{
    private double size;

    public Square(){
    }

    public Square(double size) {
        this.size = size;
    }

    public Square(String color, boolean filled, double size) {
        super(color, filled);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void howToColor() {
        System.out.println("Màu Color");
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + size + " " + super.toString()+
                '}';
    }
}
