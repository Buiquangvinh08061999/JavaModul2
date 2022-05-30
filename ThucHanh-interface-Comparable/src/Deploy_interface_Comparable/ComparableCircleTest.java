package Deploy_interface_Comparable;
import java.util.Arrays;
public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle("Blue", true, 3.5);

        System.out.println("Được sắp xếp trước: ");
        for (int i = 0 ; i < circles.length;i++){
            System.out.println(circles[i]);
        }
        Arrays.sort(circles);

        System.out.println("Sau khi sắp xếp: ");
        for (int i = 0 ; i < circles.length;i++){
            System.out.println(circles[i]);
        }

//Sắp xếp theo thứ tự tăng dần

    }
}
