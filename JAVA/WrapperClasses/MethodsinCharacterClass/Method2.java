// 2. boolean isDigit(char ch)

/**

This method is used to determine whether the specified char value(ch) is a digit or not. Here also we can pass ASCII value as an argument. 

Syntax: 

boolean isDigit(char ch)
Parameters: 

ch – a primitive character
Returns: It returns true if ch is a digit, otherwise, return false

 */

public class Method2 {

  public static void main(String[] args) {
    System.out.println(Character.isDigit('K'));
    System.out.println(Character.isDigit('2'));
  }
}
