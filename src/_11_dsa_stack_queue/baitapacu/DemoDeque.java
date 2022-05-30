package _11_dsa_stack_queue.baitapacu;
import java.util.*;

public class DemoDeque {
    public static void main(String[] args) {

        Deque<Integer> arrayDeque = new ArrayDeque<Integer>();
        arrayDeque.push(1);
        arrayDeque.push(3);
        arrayDeque.push(5);
        arrayDeque.push(7);
        arrayDeque.push(9);

        System.out.println(arrayDeque);

    }
}
