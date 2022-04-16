package LearnJaVa.ArrayBasic.break_continue;

public class SuDung_continue {
    public static void main(String[] args) {
        //Với điều kiện đó khối lệnh phía sau từ khóa continue sẽ không được thực thi,
        //Tất là các số chẳn sẽ bị bỏ qua, vì ta dùng continue
        //Nó chỉ in ra các số lẻ, vì số chẵn bị bỏ qua;
//        for (int i = 1; i < 10; i++) {
//            if (i %2==0) {
//                continue;
//            }
//            System.out.println(i);
//        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    continue;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
