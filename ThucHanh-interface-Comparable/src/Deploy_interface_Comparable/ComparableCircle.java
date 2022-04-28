package Deploy_interface_Comparable;

public class ComparableCircle extends Cirle implements Comparable<ComparableCircle>{
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if(getRadius() > o.getRadius()){
            return 1;
        }
        if (getRadius() < o.getRadius()){
            return -1;
        }else {
            return 1;
        }
    }
}
