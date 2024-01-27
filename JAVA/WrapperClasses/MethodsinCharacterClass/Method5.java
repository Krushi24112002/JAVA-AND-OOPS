// 5. boolean isLowerCase(char ch):

/**
It determines whether the specified char value(ch) is lowercase or not. 

Syntax: 

boolean isLowerCase(char ch)
Parameters: 

ch – a primitive character
Returns: It returns true if ch is lower case, otherwise, returns false.

*/

public class Method5 {

  public static void main(String[] args) {
    System.out.println(Character.isLowerCase('a'));
    System.out.println(Character.isLowerCase('A'));
    System.out.println(Character.isLowerCase(97));
  }
}
