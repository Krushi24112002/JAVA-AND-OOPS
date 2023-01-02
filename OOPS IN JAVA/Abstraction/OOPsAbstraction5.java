// Java Program to Illustrate Static Methods in Abstract Class Can be called Independently without Creating an object. 

// Class 1
// Abstract Class
abstract class Base {

    static void fun() {
        System.out.println("Abstract Class Can be called Independently without Creating an object");
    }
}

// Main Class
public class OOPsAbstraction5 {

    public static void main(String[] args) {

        // Without Creating Object Calling static Function
        Base.fun();
    }
}