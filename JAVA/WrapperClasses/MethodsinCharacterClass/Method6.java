// 6. char toUpperCase(char ch)

/**

It returns the uppercase of the specified char value(ch). If an ASCII value is passed, then the ASCII value of its uppercase will be returned. 

Syntax: 

char toUpperCase(char ch)
Parameters: 

ch – a primitive character
Returns: It returns the uppercase form of the specified char value.

 */

public class Method6 {

  public static void main(String[] args) {
    System.out.println(Character.toUpperCase('a'));
    System.out.println(Character.toUpperCase(97));
    System.out.println(Character.toUpperCase(48));
  }
}
