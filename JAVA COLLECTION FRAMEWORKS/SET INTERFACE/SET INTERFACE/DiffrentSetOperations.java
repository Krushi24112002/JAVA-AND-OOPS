// Set Interface

import java.util.HashSet;
import java.util.Set;

public class DiffrentSetOperations {

  public static void main(String[] args) {
    Set<Integer> s1 = new HashSet<>();

    // #NOTE# -> In Set Order Are Not Defined.
    s1.add(10);
    s1.add(20);
    s1.add(30);
    s1.add(40);
    s1.add(50);

    System.out.println("In Set Order Are Not Defined  = " + s1);

    // #NOTE# -> In Set Duplicate Values Can Not Allowed.
    s1.add(30); // 30 Add Two Time,But Set Print Only One Time.
    System.out.println("In Set Duplicate Values Can Not Allowed = " + s1);

    // Iterating through the Set
    // Method 1 :- For Each Loop
    for (Integer elements : s1) {
      System.out.print(elements + " ");
    }

    System.out.println();

    // Remove Perticular Element
    s1.remove(20);
    System.out.println("New Set Is = " + s1);

    // contains() :- Check Perticular Element Present or Not
    System.out.println(
      "Check Perticular Element Present or Not = " + s1.contains(10)
    );

    // isEmpty() :- Check Currently Set is Empty or Not.
    System.out.println("Check Currently Set is Empty or Not = " + s1.isEmpty());

    // size() :- Return Set Size
    System.out.println("Return Set Size = " + s1.size());

    // hashCode() :- This method is used to get the hashCode value for this instance of the Set.
    // It returns an integer value which is the hashCode value for this instance of the Set.
    System.out.println("hashCode() " + s1.hashCode());

    Set<Integer> s2 = new HashSet<>();

    s2.add(10);
    s2.add(20);
    s2.add(30);

    System.out.println("Print s2 Set = " + s2);

    // containsAll(collection) :- This method is used to check if the HashSet contains all the collection of elements.
    System.out.println("Are all the contents equal? " + s1.containsAll(s2));

    // clear() :- Use In Clear Complete Set
    s1.clear();
    System.out.println(s1);
  }
}
