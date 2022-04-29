package Deploy_interface_Resizeable;

public class Square extends Rectangle implements Resizeable{
    public Square(){
    }
    public Square(double side){
        super(side, side);
    }
    public Square(String color, boolean filled, double side){
        super(color,filled,side,side);
    }
    public double getSide(){
        return  getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLenth(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLenth(double lenth) {
        setSide(lenth);
    }

    @Override
    public String toString() {
        return "A Square with side ="
                + getSide()
                +", which is a subclass of"
                + super.toString();

    }
}
