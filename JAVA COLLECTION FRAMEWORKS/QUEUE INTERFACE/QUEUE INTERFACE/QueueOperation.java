// Queue

import java.util.*;

public class QueueOperation {

  public static void main(String[] args) {
    Queue<Integer> val = new LinkedList<>();

    // 1. Adding Elements :- Using offer() Method
    val.offer(10);
    val.offer(20);
    val.offer(30);
    val.offer(40);

    System.out.println("Print Values = " + val);

    // Iterating over Queue
    // Method :- 1 Using For each Loop
    for (Integer elements : val) {
      System.out.print(elements + " ");
    }

    System.out.println();

    // 2.Removing Elements :- Using poll() Method
    System.out.println("Which Element is poll = " + val.poll());

    // One Element Poll After Queue Elements Is
    System.out.println("One Element Poll After Queue Elements Is = " + val);

    // 3.Accessing the Element :- Using peek() Method
    System.out.println("Find Next Peek Elements = " + val.peek());
  }
}
