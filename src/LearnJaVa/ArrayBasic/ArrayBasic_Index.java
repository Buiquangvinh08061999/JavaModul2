package LearnJaVa.ArrayBasic;

public class ArrayBasic_Index {
    public static void main(String[] args) {
        //Lọc chiều dài của mảng,, Làm vòng lặp để truy suất từng vị trí ở mảng, và hiển thị giá trị
        int [] array1 ={1,2,4,5,6,15,14,4,24,26};
        System.out.println("Length is:" + array1.length);
        for (int i = 0 ; i < array1.length;i++){
            System.out.println("array["+i+"] = " + array1[i]);
        }
    }
}
