package _10_dsa_list.exercise.use_arraylist_with_library;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> mylist = new MyList<>();

        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        mylist.add(2,5);

        System.out.println(mylist.toString());
    }
}
