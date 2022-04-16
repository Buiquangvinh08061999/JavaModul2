package LearnJaVa.ArrayBasic.PhuongThucGoiLai;

public class TinhTong {

    //Cách truyền giá trị vào như  hàm function, và gọi lại hàm để truyền giá trị, để tái sử dụng nhiều lần;
    public static int sum(int i1, int i2) {
        int total = 0;
        for (int i = i1; i <= i2; i++)
            total += i;
        return total;
    }

    public static void main(String[] args) {
        //Có 2 cách truyền vào;
        int tong1den10 = sum(1,10);
        System.out.printf("Tổng từ 01 đến 10 là : %d\n" , tong1den10);
        System.out.printf("Tổng từ 20 đến 37 là : %d\n", sum(20, 37));
        System.out.printf("Tổng từ 35 đến 49 là : %d" , sum(35, 49));

    }
}
