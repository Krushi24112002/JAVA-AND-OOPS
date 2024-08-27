// Java Program to Illustrate Static Binding

/*

Static Binding (Early Binding):
-> Static binding occurs during compile-time.
-> It is also known as early binding because the method that should be invoked is determined at compile-time based on the reference type.
-> In static binding, the compiler knows exactly which method will be called based on the type of the reference variable.
-> It is mainly used for methods that are marked as final, static, or belong to a class that is not inherited.

#NOTE# :- static binding is resolved at compile-time based on the reference type
 */

// Main Class
public class OOPsStaticBinding {

  // Class 1 [SuperClass]
  public static class SuperClass {

    // Class 1 [SuperClass] Method
    static void print() {
      System.out.println("print() in superclass is called");
    }
  }

  // Class 2 [SubClass]
  public static class SubClass extends SuperClass {

    // Class 2 [SubClass] Method
    static void print() {
      System.out.println("print() in subclass is called");
    }
  }

  public static void main(String[] args) {

    SuperClass.print();

    SubClass.print();
  }
}
