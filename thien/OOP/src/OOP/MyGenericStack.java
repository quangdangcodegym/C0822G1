package OOP;

import java.util.EmptyStackException;
import java.util.LinkedList;
public class MyGenericStack<T> {
    private LinkedList<T> stack;
    public MyGenericStack(){
        stack = new LinkedList<>();
    }
    public void push(T item){
        stack.addFirst(item);
    }
    public boolean isEmpty(){
        boolean flag = (stack.size() ==0) ? true : false;
        return flag;
    }
    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public int size(){
        return stack.size();
    }


}
