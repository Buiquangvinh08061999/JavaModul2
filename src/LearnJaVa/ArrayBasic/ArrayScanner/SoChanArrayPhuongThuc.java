package LearnJaVa.ArrayBasic.ArrayScanner;

public class SoChanArrayPhuongThuc {
    public static void main(String[] args) {
        int[] array = {5,11,7,9,8,12,13,10};
        int count = timSoChan(array);
        System.out.println("Tổng các phần tử số chẵn là trong mảng: "+ count);
    }

    public static int timSoChan(int[] array){
        int count=0;
        System.out.printf("Các phần tử số chẵn trong mảng là: ");
        for (int i = 0; i<array.length;i++){
            if(array[i]%2==0){
                System.out.printf("%-4d", array[i]);
                count++;
            }
        }
        System.out.println("");
        return count;
    }
}
