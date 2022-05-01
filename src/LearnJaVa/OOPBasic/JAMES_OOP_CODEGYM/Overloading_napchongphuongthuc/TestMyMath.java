package LearnJaVa.OOPBasic.JAMES_OOP_CODEGYM.Overloading_napchongphuongthuc;

public class TestMyMath {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        System.out.println(mm.timMin(5,5));
        System.out.println(mm.timMin(5.5,6.0));
        System.out.println("Tổng a và b là: " + mm.tinhTong(15.6,50.4));


        //Cách tạo mảng và truyền vào phép tính
        double [] array = {1,2,3,4,5};
        System.out.println("Tổng mảng là: " + mm.tinhTong(array));

        //Chúng ta tái sử dung phép tính tổng, có thể tạo vô số mảng, và truyền vào nó để tính
        double [] array1 = {1,2,3,4,5,6,7,8};
        System.out.println("Tổng mảng 2 là: " + mm.tinhTong(array1));



    }
}
