package _10_dsa_list.exercise.use_arraylist_with_library;
import  java.util.Arrays;
public class Mylist<E> {
    private int size = 0;
    private static int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public Mylist(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public Mylist (int capacity){
        this.size = capacity;
    }
    public void ensureCapacity(int minCapacity){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements,newSize);
    }

    public void add(int index, E e){
        if (size == elements.length){
            ensureCapacity(size);
        }
        for (int i = size-1; i >= index; i--){
            elements[i + 1] = elements[i];
        }
        elements[index] = e;
        size++;
    }
    public E remove(int index){
        for (int i = index; i<size; i++){
            if (i == size-1){
                continue;
            }
            elements[i] = elements[i + 1];
        }
        size--;
        elements =Arrays.copyOf(elements,size);
        return (E) elements[index];
    }

    public  int size(){
        return size;
    }
    public  E clone(){
        Mylist<Integer> newArray =new Mylist<Integer>();
        newArray.elements = Arrays.copyOf(elements,size);
        newArray.size = size;
        return (E) newArray;
    }

    public boolean contains(E o ){
        for (int i =0; i< size;i++){
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
            ensureCapacity(size);
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
