// Collections

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsClassDifferentOperations {

  public static void main(String[] args) {
    List<Integer> l1 = new ArrayList<>();

    l1.add(34);
    l1.add(24);
    l1.add(21);
    l1.add(9);
    l1.add(56);
    l1.add(24);
    l1.add(98);
    l1.add(91);

    System.out.println("List = " + l1);

    // Collections.min() :- Find min Element
    System.out.println("min element = " + Collections.min(l1));

    // Collections.max() :- Find max Element
    System.out.println("max element = " + Collections.max(l1));

    // Collections.frequency() :- Find Specific Element Frequency.
    System.out.println("frequency = " + Collections.frequency(l1, 24));

    // Collections.sort() :- Sort All Elements In Ascending Order

    Collections.sort(l1);

    System.out.println("Sort All Elements In Ascending Order = " + l1);

    // Collections.sort() :- Sort All Elements In Descending Order

    Collections.sort(l1, Comparator.reverseOrder());

    System.out.println("Sort All Elements In Descending Order = " + l1);
  }
}
