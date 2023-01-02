// Java Program to Illustrate that an instance of Abstract Class can not be created.

// Class 1
// Abstract Class
abstract class Base {

    // Abstract Function(Method)
    abstract void fun();
}

// Class 2
class Derived extends Base {

    // Function(Method)
    void fun() {
        System.out.println("Derived fun() Called ");
    }
}

// Main Class
public class OOpsAbstraction1 {

    public static void main(String[] args) {

        // Uncommenting the following line will cause compiler error as the line tries
        // to create an instance of abstract class. Base b = new Base();
        Base b = new Derived();
        b.fun();
    }
}