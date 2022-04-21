package LearnJaVa.OOPBasic.JAMES_OOP_CODEGYM;

import java.time.LocalTime;

public class newStopWath {

    public static int[] selectionSort(int...array){
        for (int i = 0; i < array.length-1;i++){
            for (int j=i+1; j < array.length;j++){
                if(array[j] < array[i]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] =temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int [] array = new int[100000];
        for (int i =0; i < array.length;i++){
            array[i] = (int) Math.floor(Math.random()*100);
        }

        LocalTime start = LocalTime.now();
        array = selectionSort(array);
        LocalTime end = LocalTime.now();
        StopWatch sw = new StopWatch(start,end);

        System.out.println("Time: " + sw.getElapsedTime());
        for (int element : array){
            System.out.println(element);
        }
}
}
