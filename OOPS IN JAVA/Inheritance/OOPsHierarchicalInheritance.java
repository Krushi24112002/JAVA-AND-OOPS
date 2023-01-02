// Hierarchical Inheritance

// Creating Class A
class A {

    // Creating Class A Function(Method)
    void fun1() {
        System.out.println("Inside Function 1");
    }
}

// Creating Class B With extend Class A
class B extends A {
    // Creating Class B Function(Method)
    void fun2() {
        System.out.println("Inside Function 2");
    }
}

// Creating Class C With extend Class A

class C extends A {
    // Creating Class C Function(Method)
    void fun3() {
        System.out.println("Inside Function 3");
    }
}

// Main Class
public class OOPsHierarchicalInheritance {

    public static void main(String[] args) {

        // Creating Class A Object
        A obj1 = new A();
        obj1.fun1();

        // Creating Class B Object
        B obj2 = new B();
        obj2.fun1();
        obj2.fun2();

        // Creating Class C Object
        C obj3 = new C();
        obj3.fun1();
        obj3.fun3();
    }
}