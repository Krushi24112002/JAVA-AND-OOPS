/*
 * // #NOTE# Why Java is not a purely Object-Oriented Language? Link :- https://www.geeksforgeeks.org/java-not-purely-object-oriented-language/?ref=lbp
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

/*
 
// What is a class in Java
Class :- "A class is a group of objects which have common properties. It is a template or blueprint from which objects are created.
It is a logical entity. It can't be physical."
# A class in Java can contain #
-> Fields
-> Methods
-> Constructors
-> Blocks
-> Nested class and interface

// What is an object in Java
Object :- "An object is an instance of a class"
# An object consists of #  
State: It is represented by attributes of an object. It also shows properties of an object.
Behavior: It is represented by methods of an object. It shows response of an object with other objects.
Identity: It gives a unique name to an object. It also grants permission to one object to interact with other objects.

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
