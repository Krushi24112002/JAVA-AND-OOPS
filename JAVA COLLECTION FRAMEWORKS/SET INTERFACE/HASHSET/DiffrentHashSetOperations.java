// HashSet
// #NOTE # -> HashSet Not Follow Order To Print Elements.
import java.util.HashSet;

public class DiffrentHashSetOperations {

  public static void main(String[] args) {
    HashSet<Integer> s1 = new HashSet<>();

    // #NOTE# -> In Set Order Are Not Defined.
    s1.add(10);
    s1.add(20);
    s1.add(30);
    s1.add(40);
    s1.add(50);

    System.out.println("In HashSet Order Are Not Follow  = " + s1);

    // #NOTE# -> In HashSet Duplicate Values Can Not Allowed.
    s1.add(30); // 30 Add Two Time,But HashSet Print Only One Time.
    System.out.println("In HashSet Duplicate Values Can Not Allowed = " + s1);

    // Iterating through the HashSet
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

    // size() :- Return HashSet Size
    System.out.println("Return Set Size = " + s1.size());

    // hashCode() :- This method is used to get the hashCode value for this instance of the HashSet.
    // It returns an integer value which is the hashCode value for this instance of the HashSet.
    System.out.println("hashCode() " + s1.hashCode());

    // clone() :- Used to create a shallow copy of the HashSet.
    System.out.println(
      "Used to create a shallow copy of the set = " + s1.clone()
    );

    HashSet<Integer> s2 = new HashSet<>();

    s2.add(10);
    s2.add(20);
    s2.add(30);

    System.out.println("Print s2 Set = " + s2);

    // containsAll(collection) :- This method is used to check if the HashSet contains all the collection of elements.
    System.out.println("Are all the contents equal? " + s1.containsAll(s2));

    // clear() :- Use In Clear Complete HashSet
    s1.clear();
    System.out.println(s1);
  }
}
