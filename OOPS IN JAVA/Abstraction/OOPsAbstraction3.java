// Java Program to illustrate Abstract class Without any abstract method.

// Class 1
// Abstract Class
abstract class Base {

  // Demo method. This is not an abstract method.
  void fun() {
    System.out.println("Function of Base class is called");
  }
}

// Class 2
class Derived extends Base {
  // This class only inherits the Base class methods and properties.

}

// Main Class
public class OOPsAbstraction3 {

  public static void main(String[] args) {
    // Creating object of class 2
    Derived d = new Derived();

    // Calling function defined in class 1 inside main() with object of class 2 inside main() method
    d.fun();
  }
}
