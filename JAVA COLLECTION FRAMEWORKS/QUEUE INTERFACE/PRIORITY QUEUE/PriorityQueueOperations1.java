// Priority Queue

import java.util.PriorityQueue;

public class PriorityQueueOperations1 {

  public static void main(String[] args) {
    PriorityQueue<Integer> l1 = new PriorityQueue<>();

    // Add Elements Using offer() Function in stack

    l1.offer(1);
    l1.offer(2);
    l1.offer(3);
    System.out.println(l1);

    // offer() :- This method is used to add an element at the end of the Queue.
    l1.offer(4);
    System.out.println(l1);

    // Creating New Queue
    PriorityQueue<Integer> l2 = new PriorityQueue<>();
    l2.offer(150);
    l2.offer(200);

    // addAll() :- Joint Two Queue or Add All Elements Of Old Queue in New Queue
    l1.addAll(l2);
    System.out.println(l1);

    // remove() :- This Method Use To remove Elements At Specific Index.
    l1.remove(1);
    System.out.println(l1);

    // valueOf() :- This Method Use To Remove Perticular Value in Queue Using Specific Value.
    l1.remove(Integer.valueOf(3));
    System.out.println(l1);

    // contains() :- Using This Method Check Specific Value Exist Or Not
    System.out.println(l1.contains(24));

    // size() :- This method is used to return the size of the Queue.
    System.out.println("Size Of List l1 Is " + l1.size());

    // equals() :- This method is used to compare the equality of the given element with the elements of the Queue.
    System.out.println(l1.equals(l2));

    // hashCode() :- This method is used to return the hashcode value of the given Queue.
    System.out.println(l1.hashCode());

    // isEmpty() :- This method is used to check if the Queue is empty or not. It returns true if the Queue is empty, else false.
    System.out.println(l1.isEmpty());

    // containsAll() :- This method is used to check if the Queue contains all the collection of elements.
    System.out.println("Are all the contents equal? " + l1.containsAll(l2));

    // clear() :- This method is used to remove all the elements in the Queue. However, the reference of the Queue created is still stored.
    l1.clear();
    System.out.println(l1);
  }
}
