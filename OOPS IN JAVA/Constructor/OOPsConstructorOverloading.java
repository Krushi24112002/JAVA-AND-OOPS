// constructor overloading
/*
A constructor is just like a method(Function) in Java, but it does not have any return type. It can also be overloaded, just like other methods.

Constructor overloading is a tool/technique of having more than one constructor in the
class with different no of the parameters. Each constructor performs a different task.
The compiler differentiates them by the total number of parameters and their types.
Overloading means more than one form. It refers to the use of the same thing for a
different purpose.
*/

// NOTE: constructor overloading is used to initialize the object in different ways.

class Person {

  // Creating Properties
  String name;
  int age;

  // Constructor -1
  Person(String PersonName, int PersonAge) {
    name = PersonName;
    age = PersonAge;
  }

  // Constructor -2
  Person(String PersonName) {
    name = PersonName;
  }

  // Creating Class Function(Method)
  void PersonDetail() {
    System.out.println("Your Name Is " + name + " " + "Your Age Is " + age);
  }
}

public class OOPsConstructorOverloading {

  public static void main(String[] args) {
    // Creating Object
    Person FirstPerson = new Person("KRUSHI", 19);
    Person SecondPerson = new Person("ASHRUTA"); // This Person not add age Default Age Is 0.

    FirstPerson.PersonDetail();
    SecondPerson.PersonDetail();
  }
}
