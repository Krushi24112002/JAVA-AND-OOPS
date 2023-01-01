/*
 * // Definition Of OOPs
 * Object-Oriented Programming is a programming style that relates the
 * programming to real-world entities/models.
 * Object-Oriented programming is associated with the concept of class and
 * objects.
 */

// OOPs Advantages
/*
 * OOPs is to provide certain features like data security, reusability and
 * ensure a higher level of accuracy.
 * fast, easier to execute, maintain, modify and debug
 * provides a clear structure for the programs
 * helps to keep the Java code DRY "Don't Repeat Yourself."
 * OOP makes it possible to create complete reusable applications with less
 * code and shorter development time
 */

// NOTE: In Java, when we create an object of the class. It occupies space in the memory (heap)

// This Is Class
class Person {

    // This Is Class Properties
    int age;
    String name;

    // Class Print Function
    void PersonDetail() {
        System.out.println("HI " + name + " YOUR AGE IS " + age);
    }

}

public class OOPsClassAndObject {

    public static void main(String[] args) {

        // Creating Object Using New KeyWord

        // Objects can be created many times as per requirement.
        // First Object
        Person FirstPerson = new Person();
        FirstPerson.age = 19;
        FirstPerson.name = "KRUSHI";

        // Access Properties Using "."(Dot) Operator
        FirstPerson.PersonDetail();

        // Second Object
        Person SecondPerson = new Person();
        SecondPerson.age = 23;
        SecondPerson.name = "ASHRUTA";
        SecondPerson.PersonDetail();

    }
}