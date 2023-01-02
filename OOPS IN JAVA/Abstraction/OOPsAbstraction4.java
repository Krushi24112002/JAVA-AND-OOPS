// Java Program to Illustrate Abstract classes Can also have Final Methods.

// Class 1
// Abstract Class
abstract class Base {

    // Final Method(Function)
    final void fun() {
        System.out.println("Base Fun() Called ");
    }

}

// Class 2
class Derived extends Base {

}

// Main Class
public class OOPsAbstraction4 {

    public static void main(String[] args) {

        Base b = new Derived();
        b.fun();
    }
}