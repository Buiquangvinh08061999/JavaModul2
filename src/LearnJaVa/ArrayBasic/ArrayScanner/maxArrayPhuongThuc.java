package LearnJaVa.ArrayBasic.ArrayScanner;

public class maxArrayPhuongThuc {
    public static void main(String[] args) {
        int[] array = {88,7,77,99,13,101};
        int index1 = maxValue(array);
        System.out.printf("Giá trị lớn nhất trong mảng là %d", array[index1]);
    }
    public static int maxValue(int[] array){
        int index=0;
        for(int i =0 ; i < array.length;i++){
            if(array[i]> array[index]){  //Tất là array[index = 88] mặc định phần tử 0 đầu tiên, rồi đi so sánh
               index = i;
            }
        }
        return index;
    }

}
