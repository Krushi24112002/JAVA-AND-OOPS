// 3. boolean isWhitespace(char ch)
/**

It determines whether the specified char value(ch) is white space. Whitespace includes space, tab, or newline. 

Syntax: 

boolean isWhitespace(char ch)
Parameters: 

ch – a primitive character
Returns: It returns true if ch is whitespace, otherwise, returns false.

 */

public class Method3 {

  public static void main(String[] args) {
    System.out.println(Character.isWhitespace('A'));
    System.out.println(Character.isWhitespace(' '));
    System.out.println(Character.isWhitespace('\n'));
    System.out.println(Character.isWhitespace('\t'));

    // ASCII value of tab
    System.out.println(Character.isWhitespace(9));
    System.out.println(Character.isWhitespace('9'));
  }
}
