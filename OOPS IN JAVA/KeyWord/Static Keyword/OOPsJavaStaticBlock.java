// Java program to demonstrate use of static blocks

class Person {

    static int a = 10;
    static int b;

    // Creating static Block
    static {
        
        System.out.println("Static block initialized.");
        b = a * 4;

    }
}

public class OOPsJavaStaticBlock {

    public static void main(String[] args) {

        System.out.println("From Main");
        System.out.println("Value Of A " + Person.a);
        System.out.println("Value Of B " + Person.b);

    }
}