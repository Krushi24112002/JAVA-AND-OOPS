// Abstraction in java(OOPs)
// Defintion:- Data Abstraction is The Process Of Hiding Certain Details And Showing Only Essential Information To The User.
/* Advantages Of Abstraction
1. Only you can make changes to your data or function, and no one else can.
2. Increases the reusability of the code.
3. Avoids duplication of your code.
4. It makes the application secure by not allowing anyone else to see the Background details.
*/

// Class 1
abstract class base {

    abstract void fun();
}

// Class 2
class Derived extends base {

    void fun() {
        System.out.println("Derived fun() called");
    }
}

// Main Class
public class OOPsAbstraction {

    public static void main(String[] args) {

        base obj = new Derived();
        obj.fun();
    }
}