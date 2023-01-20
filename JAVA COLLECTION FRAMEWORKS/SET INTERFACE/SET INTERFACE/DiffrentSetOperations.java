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

        // Remove Perticular Element
        s1.remove(20);
        System.out.println("New Set Is = " + s1);

        // contains() :- Check Perticular Element Present or Not
        System.out.println("Check Perticular Element Present or Not = " + s1.contains(10));

        // isEmpty() :- Check Currently Set is Empty or Not.
        System.out.println("Check Currently Set is Empty or Not = " + s1.isEmpty());

        // size() :- Return Set Size
        System.out.println("Return Set Size = " + s1.size());

        // clear() :- Use In Clear Complete Set
        s1.clear();

        System.out.println(s1);
    }
}