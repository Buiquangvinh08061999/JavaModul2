package LearnJaVa.ArrayBasic.OneDimensionalArray;

public class ArrayOne {
    public static void main(String[] args) {
        String [] friends ={"Vinh","Top","Quang" ,"Thao","Tu","Dau"};
        System.out.println("Độ dài của mảng là " + friends.length);
        System.out.println("Tên đầu mảng là " + friends[0]);

        //Cách gán lại giá trị cho mảng friends;
        System.out.println(friends[0]);
        friends[0]="PRO";
        System.out.println(friends[0]);

        for (int i = 0 ; i < friends.length;i++){
            System.out.println("fiend["+i+"] = " + friends[i]);
        }
    }
}
