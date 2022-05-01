package _10_dsa_list.practice.list_simple;

public class MylistTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
         listInteger.add(10);
         listInteger.add(20);
         listInteger.add(30);
         listInteger.add(40);

        System.out.println("Element 1: " +  listInteger.get(1));
        System.out.println("Element 2: " +  listInteger.get(2));
        System.out.println("Element 3: " +  listInteger.get(3));


    }
}
