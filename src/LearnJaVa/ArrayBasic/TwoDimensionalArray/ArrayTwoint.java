package LearnJaVa.ArrayBasic.TwoDimensionalArray;

public class ArrayTwoint {
    public static void main(String[] args) {
        //Ma trận mảng 2 chiều; chú ý dùng print để theo ý muốn ma trận;
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
             };
        for (int i = 0 ; i < arr.length;i++ ){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        //Chú ý dùng:print;;  System.out.print(arr[i][j] + " ");


        int tong =0;
        for (int i = 0 ; i < arr.length;i++ ) {
            for (int j = 0; j < arr.length; j++) {
                    if(arr[i] == arr[j]){
                        tong+=arr[i][j];
                    }
            }
        }
        System.out.println("Tổng đường chéo chính là " + tong);
        //Chú ý dùng:print;;  System.out.print(arr[i][j] + " ");
    }
}
