import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList<E> {
    private int size=0;
    private int DEFAULT_CAPACITY=10;
    private Object element[];

    public MyList(int DEFAULT_CAPACITY) {
       element= new Object[DEFAULT_CAPACITY];
    }
    public void EnsureCapa() {
        int newsize = element.length * 2;
        element = Arrays.copyOf(element,newsize);
    }
    public void add(E e){
        if(size == element.length){
            EnsureCapa();
        }
        element[size++]=e;
    }
    public E get(int i){
        if(i>=size||i<0){
            throw new IndexOutOfBoundsException("Index:"+ i +",size"+i);
        }
        return (E)element[i];
    }
}
