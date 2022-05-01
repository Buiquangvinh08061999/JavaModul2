package Exercise_ACU.Overloading;

public class DemoBai1 {
    public static void main(String[] args) {
        System.out.println(tong(1,5));
        System.out.println(tong(1.5,2.9));

    }
    public static int tong (int a, int b){
        return  a + b;
    }
    public static double tong(double a , double b){
        return a + b ;
    }


}
