package LearnJaVa.ArrayBasic.TwoDimensionalArray;

public class ArrayTwoint {
    public static void main(String[] args) {
        //Ma trận mảng 2 chiều; chú ý dùng print để theo ý muốn ma trận;
        int[][] arr = {
                {1, 2, 30},
                {4, 5, 6},
                {40, 8, 4}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        //Chú ý dùng:print;;  System.out.print(arr[i][j] + " ");


        int tongcheochinh = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    tongcheochinh += arr[i][j];
                }
            }
        }
        System.out.println("Tổng đường chéo chính là " + tongcheochinh);

        int tongcheophu = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i + j == arr.length - 1) {
                    tongcheophu += arr[i][j];
                }
            }
        }
        System.out.println("Tổng đường chéo phụ là " + tongcheophu);
    }
}
