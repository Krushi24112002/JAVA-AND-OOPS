// Java Final Method(Function)
// NOTE: if you declare your method as final, you can not override that method.

// Creating Parent Class
class Bike {
    // Creating Parent Class Function
    final void run() {
        System.out.println("Running The Bike");
    }
}

// Creating Sub Class
class Honda extends Bike {
    // Creating Sub Class Function
    void run() {
        System.out.println("Running Safely With 80KMp");
    }
}

public class OOPsJavaFinalMethod {

    public static void main(String[] args) {

        // Creating Object Using new KeyWord.
        Honda H = new Honda();
        H.run();
    }
}

// OUTPUT:

/*
 * OOPsJavaFinalMethod.java:15: error: run() in Honda cannot override run() in
 * Bike
 * void run() {
 * ^
 * overridden method is final
 * 1 error
 */
// this program output is error Because Override Method(Function)