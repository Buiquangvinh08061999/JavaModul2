package LearnJaVa.ArrayBasic.ArrayVongLap;

public class ArrayWhile {
    public static void main(String[] args) {
        int[] arr1= {20,4,4,1,2,3,5,7};
        int i=0;
        int total = 0;
        while (i<arr1.length){
            total+=arr1[i];
            i++;
        }
        System.out.println("Tổng là: " + total);
        System.out.println("Độ dài length là: " + i);
       ;
    }


}
