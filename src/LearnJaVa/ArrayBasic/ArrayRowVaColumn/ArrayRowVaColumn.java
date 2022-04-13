package LearnJaVa.ArrayBasic.ArrayRowVaColumn;

public class ArrayRowVaColumn {
    public static void main(String[] args) {
        //Duyệt qua hàng và cột trong mảng 2 chiều
        int[][] matrix = new int[3][3];
        int total=0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 5);
                total+=matrix[row][column];
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println("");
        }
        System.out.println("Tổng là : " + total);
    }
}
