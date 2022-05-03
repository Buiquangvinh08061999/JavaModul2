package _08_cleancode_refactoring._1practice;

public class Cylinder {
    public static double getVolume(int radius, int heigth){
        double baseArea = getBaseArea(radius);
        double perimeter =getPerimeter(radius);
        double volume = perimeter * heigth + 2 * baseArea;
        return volume;
    }


    private static double getBaseArea(int radius){
        return Math.PI * radius * radius;
    }
    private  static double getPerimeter(int radius){
        return 2* Math.PI* radius;
    }


}
