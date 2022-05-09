package _11_dsa_stack_queue.baitapacu;
import java.util.*;
public class queueArray {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new ArrayDeque<>();
        int[] array = {1,3,5,7,9};
        for (int i = 0 ; i < array.length;i++){
            myQueue.offer(array[i]);
        }
        System.out.println("Get the first element no delete: "+ myQueue.peek());
        System.out.println(myQueue);

        System.out.println("Get the first element delete: "+ myQueue.poll());
        System.out.println(myQueue);
    }
}
