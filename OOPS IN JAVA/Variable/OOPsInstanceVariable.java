// 2. Instance Variables
// Instance variables are non-static variables and are declared in a class outside of any method, constructor, or block.

public class OOPsInstanceVariable {

  // Declared Instance Variable
  public String PersonName;

  // Default Constructor
  // initializing Instance Variable
  public OOPsInstanceVariable() {
    this.PersonName = "KRUSHI MONPARA";
  }

  public static void main(String[] args) {
    OOPsInstanceVariable name = new OOPsInstanceVariable();

    // Displaying O/P
    System.out.println("Person Name Is : " + name.PersonName);
  }
}
