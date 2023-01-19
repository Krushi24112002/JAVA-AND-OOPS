// Deque 

import java.util.Deque;
import java.util.LinkedList;

public class DequeBasicOperations {

    public static void main(String[] args) {

        Deque<Integer> deq = new LinkedList<>();

        // 1. Adding Elements :- Using offer() Method
        deq.offer(23);
        // 2. Adding Elements At The First Position :- Using offerFirst()
        deq.offerFirst(12);
        // 3. Adding Elements At The Last Position :- Using offerLast()
        deq.offerLast(45);
        deq.offer(26);

        System.out.println("Deque Values Is = " + deq);

        // 4.Iterating the PriorityQueue
        // Using for each loop
        for (Integer elements : deq) {
            System.out.println(elements + " ");
        }

        // 5. size() :- This method is used to find and return the size of the deque.
        System.out.println("Deque size Is = " + deq.size());

        // 6. Accessing the Element :- Using peek() Method
        System.out.println("Default peek Operation = " + deq.peek());

        // 7. Accessing The First Element :- Using peekFirst() Method
        System.out.println("peekFirst Operation = " + deq.peekFirst());

        // 8. Accessing The Last Element :- Using peekLast() Method
        System.out.println("peekLast Operation = " + deq.peekLast());

        // 9.Removing Elements :- Using poll() Method
        System.out.println("Default poll Operation = " + deq.poll());
        System.out.println("poll() " + deq);

        // 10. Removing First Element :- Using pollFirst() Method
        System.out.println("pollFirst Operation = " + deq.pollFirst());
        System.out.println("pollFirst() " + deq);

        // 11. Removing Last Element :- Using pollLast() Method
        System.out.println("pollLast Operation = " + deq.pollLast());
        System.out.println("pollLast() " + deq);

        Deque<Integer> Dq = new LinkedList<>();

        Dq.offer(11);
        Dq.offer(45);
        Dq.offer(67);
        Dq.offer(56);

        System.out.println(Dq);

        // 12.getFirst() :- This method is used to retrieve, but not remove, the first
        // element of this deque.
        System.out.println("getFirst() " + Dq.getFirst());

        // 13. getLast() :- This method is used to retrieve, but not remove, the last
        // element of this deque.
        System.out.println("getLast() " + Dq.getLast());

        // 14. contains() :- This method is used to check whether the queue contains the
        // given object or not.
        System.out.println("Check Particular Object = " + Dq.contains(45));

    }
}