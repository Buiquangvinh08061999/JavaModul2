package WEEK1.BasicWEEK1;

public class TinhGiaiThua {
    public static void main(String[] args) {

        System.out.println(5 + "!= " + tinhGiaiThua(5));
    }

    public  static int tinhGiaiThua(int n){
        int giaiThua = 1;
        for(int i= 1; i <= n; i++){
            giaiThua = giaiThua*i;
        }
        return  giaiThua;
    }
}
