package _10_dsa_list.exercise.use_arraylist_with_library;
import java.util.*;
import java.util.ArrayList;
public class generic {
    public static void main(String[] args) {
        //<Interger> :generic giúp ta báo lỗi nếu không khai báo theo kiểu <Interger>;
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(10);

        int total = 0;
        for (int i = 0 ; i<number.size();i++){
            total+=number.get(i);
        }
        System.out.println(total);
    }

}
