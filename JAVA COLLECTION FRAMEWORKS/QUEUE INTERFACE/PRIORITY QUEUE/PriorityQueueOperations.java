// Priority Queue

import java.util.PriorityQueue;

public class PriorityQueueOperations {

    public static void main(String[] args) {

        // This Priority Queue Work As A MinHeap
        PriorityQueue<Integer> pd = new PriorityQueue<>();

        System.out.println("This Priority Queue Work As A MinHeap");
        // 1. Adding Elements :- Using offer() Method
        pd.offer(40);
        pd.offer(12);
        pd.offer(26);
        pd.offer(34);

        // Print Priority Queue
        System.out.println("When Default Priority Queue Print Program Print MinHeap = " + pd);

        // 2.Removing Elements :- Using poll() Method
        System.out.println(pd.poll());

        // One Elemtent Poll After Priority Queue Elements Is
        System.out.println("One Elemtent Poll After Queue Elements Is = " + pd);

        // 3.Accessing the Element :- Using peek() Method
        System.out.println("Find Next Peek Elemets = " + pd.peek());

        // 4.Iterating the PriorityQueue
        // Method :- 1 Using For each Loop
        for (Integer Elements : pd) {
            System.out.println(Elements + "");
        }

        System.out.println();

        System.out.println("This Priority Queue Work As A MaxHeap");

        // This Priority Queue Work As A MaxHeap
        PriorityQueue<Integer> pd1 = new PriorityQueue<>(Comparator.reverseOrder());

        // 1. Adding Elements :- Using offer() Method
        pd1.offer(40);
        pd1.offer(12);
        pd1.offer(26);
        pd1.offer(34);

        // Print Priority Queue
        System.out.println("When Default Priority Queue Print Program Print MinHeap = " + pd1);

        // 2.Removing Elements :- Using poll() Method
        System.out.println(pd1.poll());

        // One Elemtent Poll After Priority Queue Elements Is
        System.out.println("One Elemtent Poll After Queue Elements Is = " + pd1);

        // 3.Accessing the Element :- Using peek() Method
        System.out.println("Find Next Peek Elemets = " + pd1.peek());

        // 4.Iterating the PriorityQueue
        // Method :- 1 Using For each Loop
        for (Integer Elements : pd1) {
            System.out.println(Elements + "");
        }
    }
}