package LearnJaVa.ArrayBasic.ArrayCoppy;

public class Arraycoppy {
    public static void main(String[] args) {
        //Coppy mảng arr1 sang 1 mảng mới;
        int[] arr1 = {10,5,6,7,6,9,7,4};
        int[] arrcoppy = new int[arr1.length];
        for (int i = 0; i < arr1.length;i++){
            arrcoppy[i] = arr1[i];
            System.out.printf("%d ",arrcoppy[i]);
        }
    }
}
