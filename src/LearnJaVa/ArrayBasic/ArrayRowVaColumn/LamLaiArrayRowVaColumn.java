package LearnJaVa.ArrayBasic.ArrayRowVaColumn;

public class LamLaiArrayRowVaColumn {
    public static void main(String[] args) {
        int [][] arr1 = new int[5][5];
        int total=0;
        for(int i = 0; i < arr1.length;i++ ){
            for (int j = 0; j<arr1[i].length; j++){
                arr1[i][j] = (int) (Math.random()*5);
                System.out.printf("%d ",arr1[i][j] );
                total+= arr1[i][j];
            }
            System.out.println("");
        }
        System.out.printf("Tong la: %d",total);

    }

}
