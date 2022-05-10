package _10_dsa_list.exercise.use_arraylist_with_library;
import  java.util.Arrays;

public class Mylist<E> {

    private int size = 0;
    private static int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public Mylist() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public Mylist(int capacity) {
        this.size = capacity;
    }

    public void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }


    public void add(int index, E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = e;
        size++;

    }

    public void remove(int index) {
        if (size == elements.length) {
            ensureCapacity();
        }

        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }




    public  int size(){
        return size;
    }


    public boolean contains(E o ){
        for (int i = 0 ; i < size;i++){
            if (elements[i] == o ){
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o){
        int result = 0;
        for (int i = 0; i<size;i++){
            if(elements[i] == o){
                result = i;
            }
        }
        return result;
    }


    public void add(E e){
        if (size == elements.length){
            ensureCapacity();
        }
        elements[size++] = e;
    }


    public  E get(int i){
        if(i>=size || i < 0){
            System.out.println("Index: " + i +", Size " +i);
        }
        return (E) elements[i];
    }

    public Object clear(){
        for (int i = 0 ; i< size; i++){
            elements[i] = null;
        }
        size = 0;
            return "Mylist{" +
                    "size=" + size +
                    ", elements=" + Arrays.toString(elements) +
                    '}';
    }

    @Override
    public String toString() {
        return "Mylist{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }

//    public void ensureCapacity(int minCapacity){
//        int newSize = elements.length * 2;
//        elements = Arrays.copyOf(elements,newSize);
//    }
}
