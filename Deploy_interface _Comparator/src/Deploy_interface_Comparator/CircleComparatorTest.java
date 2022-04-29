package Deploy_interface_Comparator;
import java.util.Comparator;
import java.util.Arrays;
public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.5);
        circles[1] =new Circle();
        circles[2] = new Circle("Yellow", false, 3.4);

        System.out.println("Được sắp xếp trước");
        for (int i =0; i<circles.length;i++){
            System.out.println(circles[i]);
        }



        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);


        System.out.println("Sau khi được sắp xếp: ");
        for (int i =0; i<circles.length;i++){
            System.out.println(circles[i]);
        }




    }
}
