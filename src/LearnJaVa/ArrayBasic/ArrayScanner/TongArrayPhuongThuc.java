package LearnJaVa.ArrayBasic.ArrayScanner;

public class TongArrayPhuongThuc {
    public static void main(String[] args) {
        int [] array ={1,5,12,13,16,12,17,11};
        int total = tinhtotal(array);
        System.out.println("Tổng các phần tử trong mảng là: " + total);
    }

    public static int tinhtotal(int[]array){
        int total=0;
        for (int i=0 ; i< array.length;i++){
            total+=array[i];
        }
//        System.out.println("Tổng các phần tử trong mảng là: " + total);
        return total;

    }
}
