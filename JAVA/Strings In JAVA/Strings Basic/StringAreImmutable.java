// Immutable String in Java
/*
1) In java, string objects are immutable. Immutable simply means unmodifiable or unchangeable.
2) Once a string object is created its data or state can’t be changed but a new string object is created.
 */

/*Example :- 1

public class StringAreImmutable {

    public static void main(String[] args) {

        String str = "KRUSHI";

        // concat() method appends the string at the end
        str.concat("MONPARA");

        // This will print KRUSHI because strings are immutable objects
        System.out.println(str);
    }
}

Output :- 
Only Print KRUSHI , Not Print KRUSHI MONPARA,Becuase Strings Are Immutable.

#NOTE# -> If You Print KRUSHI MONPARA than Use Extra Object Create.

*/

// Example :- 2

public class StringAreImmutable {

    public static void main(String[] args) {

        String str = "KRUSHI";

        str = str.concat(" MONPARA");

        System.out.println(str);
    }
}