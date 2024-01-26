package WrapperClasses;
// Autoboxing
/**

-> The automatic conversion of primitive types to the object of their corresponding wrapper classes is known as autoboxing.
-> For example – conversion of int to Integer, long to Long, double to Double, etc. 

 */

import java.util.ArrayList;

public class AutoboxingWrapperClass {

  public static void main(String[] args) {
    char ch = 'a';
    // Autoboxing - primitive to Character object conversion.
    Character a = ch;

    ArrayList<Integer> arrayList = new ArrayList<Integer>();

    arrayList.add(25);

    System.out.println(arrayList.get(0));
  }
}
