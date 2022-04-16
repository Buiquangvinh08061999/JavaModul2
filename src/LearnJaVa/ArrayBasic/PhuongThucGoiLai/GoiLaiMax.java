package LearnJaVa.ArrayBasic.PhuongThucGoiLai;

public class GoiLaiMax {
    //Cách gọi lại giá trị a và b, để tìm số nhất trong 2 số.
    public static void main(String[] args) {
        int a = 10;
        int b = 14;
        int c = max(a,b);
        System.out.printf("Số lớn nhất trong hai số %d %s %d %s %d ", a,"và",b,"là:",c);
    }
    public static int max(int a, int b){
        int result;
        if(a>b){
            result = a;
        }else {
            result = b;
        }
        return  result;
    }

}
