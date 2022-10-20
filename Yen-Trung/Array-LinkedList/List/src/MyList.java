import java.util.Arrays;

public class MyList<E> {
    public int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    public Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa(){
        int elementNewLength = elements.length*2;
        elements = Arrays.copyOf(elements, elementNewLength);
    }
    public void push(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
    public void add(int index, E element){
        ensureCapa();
        size++;
        E fakeElement[] = (E[]) Arrays.copyOf(elements, elements.length);
        fakeElement[index] = element;
        for(int i=index; i< size; i++){
            fakeElement[i+1] = (E) elements[i];
        }
        elements = fakeElement;
    }
    public E remove(int index){
        size--;
        E fakeElement[] = (E[]) Arrays.copyOf(elements, elements.length);
        for(int i=index; i< size; i++){
            elements[i] = fakeElement[i+1];
        }
        return (E) elements;
    }
    public int size(){
        return size;
    }
    public boolean contains(E o){
        for(int i=0; i< size; i++){
            if(o == elements[i]){
                return true;
            }
        }
        return false;
    }
    public int indexOf(E o){
        for(int i=0; i<size; i++){
            if(o == elements[i]){
                return i;
            }
        }
        return -1;
    }
    public void clear() {
        // clear to let GC do its work
        for (int i = 0; i < size; i++)
            elements[i] = null;
            size = 0;
    }

}
