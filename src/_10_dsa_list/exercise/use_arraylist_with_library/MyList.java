package _10_dsa_list.exercise.use_arraylist_with_library;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
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

    public int size() {
        return size;
    }

    public boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == o) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        int result = 0;
        for (int i = 0; i < size; i++) {
            if (elements[i] == o) {
                result = i;
            }
        }
        return result;
    }

    public void add(E elemen) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = elemen;
    }

    public E get(int i) {
        if (i < 0 || i > size) {
            System.out.println("Sai điều kiện! ");
        }
        return (E) elements[i];
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
    }

    @Override
    public String toString() {
        return "MyListDemo{" +
                "size=" + size +
                ", element=" + Arrays.toString(elements) +
                '}';
    }
}
