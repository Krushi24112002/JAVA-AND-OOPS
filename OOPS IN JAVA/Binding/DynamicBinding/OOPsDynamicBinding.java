// Java Program to Illustrate Dynamic Binding

/*

Dynamic Binding (Late Binding or Runtime Binding):
-> Dynamic binding occurs during runtime.
-> It is also known as late binding because the actual method to be executed is determined at runtime based on the actual object's type.
-> Dynamic binding is primarily used for overriding methods in a class hierarchy.


#NOTE# dynamic binding is resolved at runtime based on the actual object's type.
 */

// Main Class
public class OOPsDynamicBinding {

  // Class 1 [SuperClass]
  public static class superclass {

    // Class 1 [SuperClass] Method
    void print() {
      System.out.println("print in superclass is called");
    }
  }

  // Class 2 [SubClass]
  public static class subclass extends superclass {

    // Class 2 [SubClass] Method
   @Override
    void print() {
      System.out.println("print in subclass is called");
    }
  }

  public static void main(String[] args) {
    superclass obj1 = new superclass();
    obj1.print();

    subclass obj2 = new subclass();
    obj2.print();
  }
}
