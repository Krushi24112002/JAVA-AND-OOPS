// SortedSet

import java.util.SortedSet;
import java.util.TreeSet;

public class DifferentSortedSetOperations1 {

  public static void main(String[] args) {
    SortedSet<Integer> s1 = new TreeSet<>();

    // #NOTE# -> Print Elements In Sort Order
    s1.add(50);
    s1.add(20);
    s1.add(30);
    s1.add(10);
    s1.add(40);

    System.out.println("Print Elements In Sorted Order " + s1);

    // #NOTE# -> In TreeSet Duplicate Values Can Not Allowed.
    s1.add(30); // 30 Add Two Time,But TreeSet Print Only One Time.
    System.out.println("In SortedSet Duplicate Values Can Not Allowed = " + s1);

    // Iterating through the SortedSet
    // Method 1 :- For Each Loop
    for (Integer elements : s1) {
      System.out.print(elements + " ");
    }

    System.out.println();

    // Remove Particular Element
    s1.remove(20);
    System.out.println("New Set Is = " + s1);

    // contains() :- Check Particular Element Present or Not
    System.out.println(
      "Check Particular Element Present or Not = " + s1.contains(10)
    );

    // isEmpty() :- Check Currently Set is Empty or Not.
    System.out.println("Check Currently Set is Empty or Not = " + s1.isEmpty());

    // size() :- Return SortedSet Size
    System.out.println("Return Set Size = " + s1.size());

    // hashCode() :- This method is used to get the hashCode value for this instance of the SortedSet.
    // It returns an integer value which is the hashCode value for this instance of the SortedSet.
    System.out.println("hashCode() " + s1.hashCode());

    SortedSet<Integer> s2 = new TreeSet<>();

    s2.add(20);
    s2.add(10);
    s2.add(30);

    System.out.println("Print Elements In Sorted Order = " + s2);

    // containsAll(collection) :- This method is used to check if the SortedSet contains all the collection of elements.
    System.out.println("Are all the contents equal? " + s1.containsAll(s2));

    // clear() :- Use In Clear Complete SortedSet
    s1.clear();
    System.out.println(s1);
  }
}
