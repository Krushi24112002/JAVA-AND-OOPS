// OOPs Nested Class

// Java Program to Demonstrate Nested class
class Outer {

  class Inner {

    //method of inner class
    public void printfun() {
      System.out.println("In a nested class method");
    }
  }
}

// Main Class
public class OOPsNestedClass {

  public static void main(String[] args) {
    // Note how inner class object is created inside Main Class
    Outer.Inner obj = new Outer().new Inner();

    //Calling printfun() method over above object created
    obj.printfun();
  }
}
