package _11_dsa_stack_queue._1practice;

import java.util.LinkedList;

public class MyGenericStack_1<T> {
    private LinkedList<T> stack;

    public MyGenericStack_1(){
        stack = new LinkedList<>();
    }

    public  void push(T element){
        stack.addFirst(element);
    }

    public T pop(){
        if (isEmpty()){
            throw new RuntimeException();
        }
        return stack.removeFirst();
    }
    public  int size(){
        return stack.size();
    }

    public boolean isEmpty(){
        if (stack.size() == 0){
            return true;
        }
        return false;
    }
}
