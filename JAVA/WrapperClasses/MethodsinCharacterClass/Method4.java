// 4. boolean isUpperCase(char ch):

/** It determines whether the specified char value(ch) is uppercase or not. 

Syntax: 

boolean isUpperCase(char ch)
Parameters: 

ch – a primitive character
Returns: It returns true if ch is upper case, otherwise, returns false.

*/

public class Method4 {

  public static void main(String[] args) {
    System.out.println(Character.isUpperCase('A'));
    System.out.println(Character.isUpperCase('a'));
    System.out.println(Character.isUpperCase(65));
  }
}
