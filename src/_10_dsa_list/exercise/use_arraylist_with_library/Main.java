package _10_dsa_list.exercise.use_arraylist_with_library;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> mylist = new MyList<>();

        mylist.add(10);
        mylist.add(20);
        mylist.add(30);
        mylist.add(2,40);

        System.out.println(mylist.toString());
    }
}
