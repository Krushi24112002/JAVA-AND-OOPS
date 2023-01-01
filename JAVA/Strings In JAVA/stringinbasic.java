// String
/* 
-> Strings are used for storing text.
-> A String variable contains a collection of characters surrounded by double quotes:


#NOTE# (Immutable String in Java)

-> In java, string objects are immutable. Immutable simply means unmodifiable or unchangeable.
-> Once string object is created its data or state can’t be changed but a new string object is created.
-> String is a sequence of characters. In java, objects of String are immutable which means a constant and cannot be changed once created.

*/

public class stringinbasic {

    public static void main(String[] args) {

        // Declare String without using new operator
        String str = "KRUSHI";
        System.out.println(str);

        // Declare String using new operator
        String name = new String("KRUSHI MONPARA");
        System.out.println(name);

        // Immutable String Example
        String s = "ASHRUTA";
        s.concat("MONPARA"); // concat() method appends the string at the end
        System.out.println(s); // will print ASHRUTA because strings are immutable objects.

        // Using Create Diffrent String Object Can Be add or Update String.
        String sr = "ASHRUTA";
        sr = sr.concat(" MONPARA");
        System.out.println(sr);
    }
}