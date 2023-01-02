// Java Program to Illustrate Abstract Class Can contain Constructors

// Class 1
// Abstract Class
abstract class Base {

    // Constructor of class 1
    Base() {
        System.out.println("Base Constructor Called");
    }

    // Abstract method inside class 1
    abstract void fun();
}

// Class 2
class Derived extends Base {

    // Constructor of class 2
    Derived() {
        System.out.println("Dervide Constructor Called");
    }

    // Method of class2
    void fun() {
        System.out.println("Derived fun() called");
    }
}

// Main Class
public class OOPsAbstraction2 {

    public static void main(String[] args) {

        // Creating object of class 2 inside main() method
        Derived d = new Derived();
        d.fun();
    }
}