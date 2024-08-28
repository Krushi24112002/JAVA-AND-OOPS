// SortedSet
// #NOTE# :- This SortedSet Main Use in Sort The Elements

import java.util.SortedSet;
import java.util.TreeSet;

public class DifferentSortedSetOperations {

  public static void main(String[] args) {
    SortedSet<String> s1 = new TreeSet<>();

    s1.add("India");
    s1.add("Australia");
    s1.add("South Africa");

    // Print Elements in Sorted Order.
    System.out.println("Print Elements in Sorted Order " + s1);

    SortedSet<Character> s2 = new TreeSet<>();

    s2.add('B');
    s2.add('A');
    s2.add('C');
    s2.add('A');

    // Duplicate Elements Can Not Print Multiple Times. only one Time Print,
    System.out.println(
      "Print Elements in Sorted Order And Duplicate Elements Print Only One Time " +
      s2
    );

    SortedSet<Integer> s3 = new TreeSet<>();

    s3.add(12);
    s3.add(9);
    s3.add(18);
    s3.add(1);
    s3.add(9);

    System.out.println(
      "Print Elements in Sorted Order And Duplicate Elements Print Only One Time " +
      s3
    );
  }
}
