import java.util.*;

public class ArrayListExample {

  public static void main(String[] args) {
    ArrayList<Integer> l1 = new ArrayList<>();

    // Add Elements Using add() Function
    l1.add(1);
    l1.add(2);
    l1.add(3);
    System.out.println(l1);

    // add() :- This method is used to add an element at the end of the List.
    l1.add(4);
    System.out.println(l1);

    // add(int index, Object): This method is used to add an element at a specific index in the List
    l1.add(4, 5);
    System.out.println(l1);

    // Creating New ArrayList
    ArrayList<Integer> l2 = new ArrayList<>();
    l2.add(150);
    l2.add(200);

    // addAll() :- Joint Two List or Add All Elements Of Old List in New List
    l1.addAll(l2);
    System.out.println(l1);

    // get() :- Using get() Method Get Specific Value.
    System.out.println(l1.get(1));

    // remove() :- This Method Use To remove Elements At Specific Index.
    l1.remove(1);
    System.out.println(l1);

    // valueOf() :- This Method Use To Remove Particular Value in List Using Specific Value.
    l1.remove(Integer.valueOf(3));
    System.out.println(l1);

    // set() :- Update List Using set() method.
    l1.set(1, 24);
    System.out.println(l1);

    // contains() :- Using This Method Check Specific Value Exist Or Not
    System.out.println(l1.contains(24));

    // Iterating over List
    // Method 1 :- Using for Loop
    for (int i = 0; i < l1.size(); i++) { // size() method use.
      System.out.print(l1.get(i) + " ");
    }

    System.out.println();

    // Method 2 :- Using For Each Loop
    for (Integer elements : l1) {
      System.out.print(elements + " ");
    }

    System.out.println();

    // size() :- This method is used to return the size of the list.
    System.out.println("Size Of List l1 Is : " + l1.size());

    // indexOf() :- This method returns the first occurrence of the given element or -1 if the element is not present in the list.
    System.out.println(
      "Return Value Index, if Value Is Present " + l1.indexOf(24)
    );
    System.out.println(
      "if value is not present than return -1 =  " + l1.indexOf(500)
    );

    // equals() :- This method is used to compare the equality of the given element with the elements of the list.
    System.out.println(l1.equals(l2));

    // hashCode() :- This method is used to return the hashCode value of the given list.
    System.out.println(l1.hashCode());

    // isEmpty() :- This method is used to check if the list is empty or not. It returns true if the list is empty, else false.
    System.out.println(l1.isEmpty());

    // containsAll() :- This method is used to check if the list contains all the collection of elements.
    System.out.println("Are all the contents equal? " + l1.containsAll(l2));

    // clear() :- This method is used to remove all the elements in the list. However, the reference of the list created is still stored.
    l1.clear();
    System.out.println(l1);
  }
}
