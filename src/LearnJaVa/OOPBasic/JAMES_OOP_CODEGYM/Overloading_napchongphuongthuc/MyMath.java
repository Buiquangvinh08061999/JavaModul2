package LearnJaVa.OOPBasic.JAMES_OOP_CODEGYM.Overloading_napchongphuongthuc;
/*Overloading Nạp chồng phương thức, cho ghi trùng tên nhưng khác kiểu dữ liệu*/
public class MyMath {
    public MyMath(){
    }
    public int timMin(int a, int b){
        if(a<b){
            return a;
        }
        return b;
    }

    public  double timMin(double a, double b){
        if(a<b){
            return a;
        }
        return b;
    }

    public double tinhTong(double a, double b){
        return  a + b;
    }

    public double tinhTong(double[] array){
        double tong = 0;
        for (int i = 0; i< array.length;i++){
            tong += array[i];
        }
        return  tong;
    }
}
