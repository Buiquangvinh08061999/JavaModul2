package LearnJaVa.ArrayBasic.PhuongThucGoiLai;

public class GoiLaiThamSo {
    public static void main(String[] args) {
        //Cách truyền tham số và gọi lại
        int a = 1;
        int b =2;
        System.out.println("Befor1, so a la "+ a+" o b la "+b);/*a = 1; b=2*/
        swap(a,b);

        System.out.println("AFter4, so a la "+ a+" o b la "+b);/*a=1 ; b=2, vì vẫn nằm tròng vùng nhớ, k liên quán tới swap(a, b)*/
    }
    public  static  void swap(int n1,int n2){
        System.out.println("Befor2, so a la "+ n1+" so b la "+n2);/*a = 1; b=2*/

        int temp = n1;
        n1 =n2;
        n2 =temp;
        System.out.println("Befor4, so a la "+ n1+" so b la "+n2);/*a = 2; b=1, vì đã hoán đổi*/
    }

}
