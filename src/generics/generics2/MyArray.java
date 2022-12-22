package classes.generics;

import java.util.Arrays;
 
class MyArray<E> {
    private final Object[] objArray;   //object array
    public final int length;
    
    public MyArray(int length)    {
        objArray = new Object [length];
        this.length = length;
    }

    E get(int i) {
        @SuppressWarnings("unchecked")
        final E e = (E)objArray[i];
        return e;
    }

    void set(int i, E e) {
        objArray[i] = e;
    }

    public String toString() {
        return Arrays.toString(objArray);
    }

    public static void main(String[] args){
        final int length = 5;
        MyArray<Integer>intArray = new MyArray<Integer>(length);
        for (int i = 0; i < length; i++)
            intArray.set(i, i * 2);
        System.out.println(intArray);
    }
}

