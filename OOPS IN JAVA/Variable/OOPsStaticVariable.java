// 3. Static Variables
// Static variables are also known as class variables.
// These variables are declared similarly to instance variables. The difference is that static variables are declared using the static keyword within a class outside of any method, constructor, or block.

public class OOPsStaticVariable {

  static String PersonName = "KRUSHI MONPARA";

  public static void main(String[] args) {
    System.out.println("PersonName Is : " + PersonName);
    // OR
    System.out.println("PersonName Is : " + OOPsStaticVariable.PersonName);
  }
}
