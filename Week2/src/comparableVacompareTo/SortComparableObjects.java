package comparableVacompareTo;
import java.util.Arrays;
public class SortComparableObjects {
    public static void main(String[] args) {
        String[] city = {"Huế", "Đà Nẵng", "Quảng Trị", "Nha Trang"};
        Arrays.sort(city);

        for(String i: city){
            System.out.println(city + " ");
        }


    }
}
