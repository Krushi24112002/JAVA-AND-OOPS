// 1.boolean isLetter(char ch)

/**

This method is used to determine whether the specified char value(ch) is a letter or not.
The method will return true if it is letter([A-Z],[a-z]), otherwise return false. In place of character.

 */

public class Method1 {

  public static void main(String[] args) {
    System.out.println(Character.isLetter('K')); // Only Take one Character to check.
    System.out.println(Character.isLetter('2')); // Only Take one Digit to check.
  }
}
