// TreeSet

import java.util.TreeSet;

public class DiffrentTreeSetOperations {

    public static void main(String[] args) {

        TreeSet<Integer> s1 = new TreeSet<>();

        // Print Elements in Sorted Order.
        s1.add(50);
        s1.add(20);
        s1.add(30);
        s1.add(10);
        s1.add(40);

        System.out.println("Print Elements in Sorted Order " + s1);

        // #NOTE# -> In TreeSet Duplicate Values Can Not Allowed.
        s1.add(30); // 30 Add Two Time,But TreeSet Print Only One Time.
        System.out.println("In TreeSet Duplicate Values Can Not Allowed = " + s1);

        // Iterating through the TreeSet
        // Method 1 :- For Each Loop
        for (Integer elements : s1) {
            System.out.println(elements + " ");
        }

        // Remove Perticular Element
        s1.remove(20);
        System.out.println("New Set Is = " + s1);

        // contains() :- Check Perticular Element Present or Not
        System.out.println("Check Perticular Element Present or Not = " + s1.contains(10));

        // isEmpty() :- Check Currently TreeSet is Empty or Not.
        System.out.println("Check Currently Set is Empty or Not = " + s1.isEmpty());

        // size() :- Return Set Size
        System.out.println("Return Set Size = " + s1.size());

        // hashCode() :- This method is used to get the hashCode value for this instance
        // of the TreeSet. It returns an integer value which is the hashCode value for
        // this
        // instance of the TreeSet.
        System.out.println("hashCode() " + s1.hashCode());

        // clone() :- Used to create a shallow copy of the TreeSet.
        System.out.println("Used to create a shallow copy of the set = " + s1.clone());

        TreeSet<Integer> s2 = new TreeSet<>();

        s2.add(10);
        s2.add(20);
        s2.add(30);

        System.out.println("Print s2 Set = " + s2);

        // containsAll(collection) :- This method is used to check if the TreeSet
        // contains all the
        // collection of elements.
        System.out.println("Are all the contents equal? " + s1.containsAll(s2));

        // clear() :- Use In Clear Complete TreeSet
        s1.clear();
        System.out.println(s1);

    }
}