// StringBuilder

/*

-> StringBuilder in Java represents a mutable sequence of characters.
-> However, the StringBuilder class differs from the StringBuffer class on the basis of synchronization.
-> The StringBuilder class provides no guarantee of synchronization whereas the StringBuffer class does.
-> StringBuilder are not safe for use by multiple threads.

 */

public class stringbuilder {

  public static void main(String[] args) {
    // 1.Append Method In StringBuilder.
    // NOTE :- Used to add text at the end of the existing text.
    StringBuilder str1 = new StringBuilder("KRUSHI ");
    str1.append("MONPARA");
    System.out.println(str1);
    // This String Also Print Other Way
    System.out.println(str1.toString());

    // 2.insert Method In StringBuilder
    // NOTE :- Inserts text at the specified index position
    StringBuilder str2 = new StringBuilder("You Can ");
    str2.insert(8, "Achive");
    System.out.println(str2);

    // 3. replace Method In StringBuilder
    // NOTE :- Replace one set of characters with another set inside a StringBuffer
    // object
    StringBuilder str3 = new StringBuilder("IJAVA");
    str3.replace(1, 1, "LOVE");
    System.out.println(str3);

    // 4. delete Method In StringBuilder
    // NOTE :- Deletes a sequence of characters from the invoking object
    StringBuilder str4 = new StringBuilder("Hello");
    str4.delete(1, 3);
    System.out.println(str4);

    // 5. deleteCharAt Method In StringBuilder
    // NOTE :- Deletes the character at the index specified by location
    StringBuilder str5 = new StringBuilder("Jhony");
    str5.deleteCharAt(4);
    System.out.println(str5);

    // 6. reverse Method In StringBuffer
    // Reverse the characters within a StringBuilder
    StringBuilder str6 = new StringBuilder("KRUSHI");
    str6.reverse();
    System.out.println(str6);

    // 7. Length Method In StringBuilder
    // NOTE :- Returns length of the string
    StringBuilder str7 = new StringBuilder("KRUSHI");
    System.out.println("Your String Length Is " + str7.length());

    // 8.charAt Method In StringBuilder
    // NOTE :- This method returns the char value in this sequence at the specified
    // index.
    StringBuilder str8 = new StringBuilder("KRUSHI");
    System.out.println(str8.charAt(3));

    // 9.substring Methid In StringBuulder
    StringBuilder str9 = new StringBuilder("KRUSHI MONPARA");
    System.out.println(str9.substring(0, 6));
  }
}
