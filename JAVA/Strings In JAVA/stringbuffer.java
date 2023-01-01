// StringBuffer
/*

-> StringBuffer in Java represents a mutable sequence of characters.
-> StringBuffer is a peer class of String that provides much of the functionality of strings.
-> The string represents fixed-length, immutable character sequences while StringBuffer represents growable and writable character sequences.
-> StringBuffer class is used to create mutable (modifiable) string.
-> The StringBuffer class in java is same as String class except it is mutable i.e. it can be changed.

#NOTE# 
-> StringBuffer(): creates an empty string buffer with the initial capacity of 1

#Remember NOTE//
-> The advantage of StringBuilder is faster performance.
However, in cases in which you are using multithreading,  you must use StringBuffer rather than StringBuilder.

 */

public class stringbuffer {

    public static void main(String[] args) {

        // 1.Append Method In StringBuffer
        // NOTE :- Used to add text at the end of the existing text.
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("Joy"); // now original string is changed
        System.out.println(sb);

        // 2.insert Method In StringBuffer
        // NOTE :- Inserts text at the specified index position
        StringBuffer sb1 = new StringBuffer("You Can ");
        sb1.insert(8, "Achive");
        System.out.println(sb1);

        // 3. replace Method In StringBuffer
        // NOTE :- Replace one set of characters with another set inside a StringBuffer
        // object
        StringBuffer sb2 = new StringBuffer("IJAVA");
        sb2.replace(1, 1, "LOVE");
        System.out.println(sb2);

        // 4. delete Method In StringBuffer
        // NOTE :- Deletes a sequence of characters from the invoking object
        StringBuffer sb3 = new StringBuffer("Hello");
        sb3.delete(1, 3);
        System.out.println(sb3);

        // 5. deleteCharAt Method In StringBuffer
        // NOTE :- Deletes the character at the index specified by location
        StringBuffer sb5 = new StringBuffer("Jhony");
        sb5.deleteCharAt(4);
        System.out.println(sb5);

        // 6. reverse Method In StringBuffer
        // Reverse the characters within a StringBuffe
        StringBuffer sb6 = new StringBuffer("KRUSHI");
        sb6.reverse();
        System.out.println(sb6);

        // 7. Length Method In StringBuffer
        // NOTE :- Returns length of the string
        StringBuffer sb7 = new StringBuffer("KRUSHI");
        System.out.println("Your String Length Is " + sb7.length());

        // 8.charAt Method In StringBuffer
        // NOTE :- This method returns the char value in this sequence at the specified
        // index.
        StringBuffer sb8 = new StringBuffer("KRUSHI");
        System.out.println(sb8.charAt(3));

    }
}