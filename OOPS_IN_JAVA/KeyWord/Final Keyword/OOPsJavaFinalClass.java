// Java Final Class
// NOTE: If you make any class as final, you cannot extend that class OR cannot inherit from Parent Class.

// Creating Parent Class 
final class Bike {
    // Creating Parent Class Function(Method)
    void run() {
        System.out.println("Running The Bike");
    }
}

// Creating Sub Class
class Honda extends Bike {
    // Creating Sub Class Function(Method)
    void run() {
        System.out.println("Running Safly With 80KMP");
    }
}

public class OOPsJavaFinalClass {

    public static void main(String[] args) {
        Honda H = new Honda();
        H.run();
    }
}

// OUTPUT
/*
 * OOPsJavaFinalClass.java:13: error: cannot inherit from final Bike
 * class Honda extends Bike {
 * ^
 * 1 error
 */

// This Programm error Beacuse Parent class is Declared Final