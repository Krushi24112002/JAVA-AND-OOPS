// Vector Class in List Interface
/*
 * 
 * 1. Vector(): Creates a default vector of the initial capacity is 10.
 * 
 * Vector<E> v = new Vector<E>();
 * 
 * 2. Vector(int size): Creates a vector whose initial capacity is specified by
 * size.
 * 
 * Vector<E> v = new Vector<E>(int size);
 * 
 * 3. Vector(int size, int incr): Creates a vector whose initial capacity is
 * specified by size and increment is specified by incr. It specifies the number
 * of elements to allocate each time a vector is resized upward.
 * 
 * Vector<E> v = new Vector<E>(int size, int incr);
 * 
 * 4.Vector(Collection c): Creates a vector that contains the elements of collection c.
 * 
 * Vector<E> v = new Vector<E>(Collection c);
 * 
 */

import java.util.*;

public class BasicVectorInformation {

    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();

        Vector<Integer> v1 = new Vector<>(10);

        Vector<Integer> v2 = new Vector<>(10, 2);
    }
}
