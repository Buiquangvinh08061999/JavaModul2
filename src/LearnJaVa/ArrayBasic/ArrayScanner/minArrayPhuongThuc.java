package LearnJaVa.ArrayBasic.ArrayScanner;

public class minArrayPhuongThuc {
    public static void main(String[] args) {
        int [] array ={6,5,8,1,12,57,21,4,2};
        int index1= minValue(array);
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + array[index1]);
    }
    public static int minValue(int[]array){
        int index = 0;
        for (int i=0;i<array.length;i++){
            if(array[i]<array[index]){ /*array[index =6], vị trí array[0], rồi đi so sánh, xong rồi trả về vị trí i,*/
                index =i;
            }
        }
        return index;
    }
}
