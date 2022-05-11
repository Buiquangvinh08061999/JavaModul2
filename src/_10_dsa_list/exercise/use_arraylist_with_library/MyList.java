package _10_dsa_list.exercise.use_arraylist_with_library;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyList(){
        element = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity){
        element = new Object[capacity];
    }
    public void ensureCapacity(){
        int newSize = element.length *2;
        element = Arrays.copyOf(element, newSize);
    }

    public void add(int index, E e){
        if (size == element.length){
            ensureCapacity();
        }
        for (int i = size; i > index;i--){
            element[i] = element[i - 1];
        }
        element[index] = e;
        size++;
    }
    public void remove(int index){
        if(size== element.length){
            ensureCapacity();
        }
        for (int i = index; i < size ; i++){
            element[i] = element[i+1];
        }
        size--;
    }
    public int size(){
        return  size;
    }

    public boolean contains(E o ){
        for (int i = 0 ; i < size;i++){
            if(element[i] == o){
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o){
        int result =0;
        for (int i = 0 ; i < size;i++){
            if (element[i] == o){
                result = i;
            }
        }
        return result;
    }

    public void add(E elemen){
        if(size == element.length){
            ensureCapacity();
        }
        element[size++] = elemen;
    }

    public E get (int i){
        if(i < 0 || i> size){
            System.out.println("Sai điều kiện! ");
        }
        return (E) element[i];
    }

    public void clear(){
        for (int i = 0; i < size;i++){
            element[i] = null;
        }
    }

    @Override
    public String toString() {
        return "MyListDemo{" +
                "size=" + size +
                ", element=" + Arrays.toString(element) +
                '}';
    }
}
