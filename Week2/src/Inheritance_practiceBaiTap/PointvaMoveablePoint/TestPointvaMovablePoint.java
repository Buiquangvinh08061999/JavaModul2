package Inheritance_practiceBaiTap.PointvaMoveablePoint;


public class TestPointvaMovablePoint {
    public static void main(String[] args) {
        Point point = new Point(10,5);
        System.out.println(point);

        MovablePoint movablePoint = new MovablePoint(10,9,10,5);
        System.out.println(movablePoint);

        System.out.println("Move Point + MovablePoint là:" + movablePoint.move());
    }

}
