// Java Program to Illustrate Static Binding

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
    SuperClass obj1 = new SuperClass();
    obj1.print();

    SubClass obj2 = new SubClass();
    obj2.print();
  }
}
