//  invoke the current class constructor Using This KeyWord
/*
 * NOTE: The this() constructor call can be used to invoke the current class
 * constructor. It is used
 * to reuse the constructor. In other words, it is used for constructor
 * chaining.
 */

// Creating Class
class Person {

    // Creating Constructor -1
    Person() {
        this(19);
    }

    // Creating Parameterized Constructor -2
    Person(int k) {
        System.out.println("Person Age Is " + k);
    }
}

public class OOPsInvokeTheCurrentClassConstructorUsingThisKeyWord {

    public static void main(String[] args) {

        // Creating Object
        Person PersonDetail = new Person();

    }
}