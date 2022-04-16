package LearnJaVa.ArrayBasic.ArrayScanner;

public class timSoChan {
    public static void main(String[] args) {
        System.out.println("Số chẳn có trong mảng là:"+ checkSoChan() + " phần tử");
    }
    public  static int checkSoChan(){
        int[] array = {5,11,7,9,8,12,13,10};
        int count=0;
        System.out.printf("Các phần tử số chẳn trong mảng là: ");
        for (int i=0; i < array.length;i++){
            if(array[i]%2==0){
                System.out.printf("%d ", array[i]);
                count++;
            }
        }
        System.out.println("");
        return count;
    }
}
