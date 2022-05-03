package _10_dsa_list.practice.list_simple;

import  java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACCITY =10;
    private Object element[];

    public MyList(){
        element = new Object[DEFAULT_CAPACCITY];
    }
    public void  ensureCapa(){
        int newSize  = element.length *2;
        element = Arrays.copyOf(element, newSize);
    }
    public void add(E e){
        if(size == element.length){
            ensureCapa();
        }
        element[size++] =e;
    }
    public E get(int i){
        if(i >=size || i<0){
            System.out.println("Index : " + i + ", Size" + i);
        }
        return (E) element[i];
    }



}
