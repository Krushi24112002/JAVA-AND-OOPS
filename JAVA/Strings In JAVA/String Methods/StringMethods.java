// String Methods

public class StringMethods {

    public static void main(String[] args) {

        String s = "KRUSHI MONPARA";

        // 1. int length(): Returns the number of characters in the String
        System.out.println("Returns the number of characters in the String is " + s.length());

        // 2. Char charAt(int i): Returns the character at ith index
        System.out.println("Character at 3rd position = " + s.charAt(3));

        // 3. String substring(int i): Return the substring from the ith index characte
        // to end.
        System.out.print("SubString " + s.substring(7));

        // 4. String substring (int i, int j): Returns the substring from i to j-1
        // index.
        System.out.println("Substring With Start Index To End Index " + s.substring(0, 14));

        // 5. String concat( String str): Concatenates specified string to the end of
        // this string.
        String s1 = "HELLO";
        String s2 = " KRUSHI";
        System.out.print("Joint Two String " + s1.concat(s2));

        // 6. int indexOf(String s): Returns the index within the string of the first
        // occurrence of the specified string.
        String s3 = "Learn Share Learn";
        System.out.println("Index of Share " + s3.indexOf("Share"));

        // 7.int indexOf (String s, int i): Returns the index within the string of the
        // first occurrence of the specified string, starting at the specified index.
        String s4 = "Learn Share Learn";
        System.out.println("Index of a  = " + s4.indexOf('h', 2));

        // 8. Int lastIndexOf( String s): Returns the index within the string of the
        // last
        // occurrence of the specified string.
        String s5 = "Learn Share Learn";
        System.out.println("Last Index of a = " + s5.lastIndexOf('h'));

        // 9. boolean equals( Object otherObj): Compares this string to the specified
        // object.
        Boolean a1 = "KRUSHI".equals("KRUSHI");
        System.out.println("KRUSHI = KRUSHI " + a1);

        Boolean a2 = "KRUSHI".equals("krushi");
        System.out.println("KRUSHI = krushi " + a2);

        // 10. boolean equalsIgnoreCase (String anotherString): Compares string to
        // another string, ignoring case considerations.
        Boolean b1 = "MONPARA".equalsIgnoreCase("monpara");
        System.out.println("MONPARA = monpara " + b1);

        // 11. int compareTo( String anotherString): Compares two string
        // lexicographically.
        // This returns difference k1-k2. If :
        // out < 0 // k1 comes before k2
        // out = 0 // s1 and s2 are equal.
        // out > 0 // s1 comes after s2.
        String k1 = "RDJ";
        String k2 = "RDJ.MR";
        int c1 = k1.compareTo(k2);
        System.out.println("the difference between ASCII value is = " + c1);

        // 12.int compareToIgnoreCase( String anotherString): Compares two string
        // lexicographically, ignoring case considerations.
        // Note- In this case, it will not consider case of a letter (it will ignore
        // whether it is uppercase or lowercase).
        String g1 = "RDJ";
        String g2 = "rdj.MR";
        int c2 = g1.compareToIgnoreCase(g2);
        System.out.println("the difference between ASCII value is = " + c2);

        // 13. String toLowerCase(): Converts all the characters in the String to lower
        // case.
        String l1 = "NEVER GIVE UP";
        System.out.println("Changing to lower Case " + l1.toLowerCase());

        // 14. String toUpperCase(): Converts all the characters in the String to upper
        // case.
        String l2 = "never give up";
        System.out.println("Changing to Upper Case " + l2.toUpperCase());

        // 15. String trim(): Returns the copy of the String, by removing whitespaces at
        // both ends. It does not affect whitespaces in the middle.
        String n1 = " Learn Share Learn ";
        System.out.println("Trim the word " + n1.trim());

        // 16. String replace (char oldChar, char newChar): Returns new string by
        // replacing all occurrences of oldChar with newChar.
        String z1 = "keekforkeek";
        System.out.println("Original String " + z1);
        String z2 = "keekforkeek".replace('k', 'j');
        System.out.println("Replaced k with j -> " + z2);
    }
}