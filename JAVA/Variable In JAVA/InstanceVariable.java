// 2. Instance Variables
// Instance variables are non-static variables and are declared in a class outside of any method, constructor, or block.
// As instance variables are declared in a class, these variables are created when an object of the class is created and destroyed when the object is destroyed.
// Unlike local variables, we may use access specifiers for instance variables. If we do not specify any access specifier, then the default access specifier will be used.
// Instance variables can be accessed only by creating objects.

public class InstanceVariable {

  // Declared Instance Variable
  public String PersonName;

  // Default Constructor
  // initializing Instance Variable
  public InstanceVariable() {
    this.PersonName = "KRUSHI MONPARA";
  }

  public static void main(String[] args) {
    InstanceVariable name = new InstanceVariable();

    // Displaying O/P
    System.out.println("Person Name Is : " + name.PersonName);
  }
}
