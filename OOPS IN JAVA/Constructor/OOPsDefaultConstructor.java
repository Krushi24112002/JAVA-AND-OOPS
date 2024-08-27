// Default Constructor
/*
Basically, the purpose of the default constructor is to provide the default values to the objects like null, 0, etc. according to the type.
*/

// Basic Important Key Points Related To Constructor Always Remember.
/*
1.A constructor’s name must be exactly the same as the name of its class.
2.The constructor is a special method because it does not have a return type. We do not even need to write void as the return type
3.It can have all Access Modifiers are allowed (private, public, protected, default)
4.It Cannot have any Non Access Modifiers (final, static, abstract, synchronized)
5.It can take any number of parameters.
*/

// NOTE:constructor is called as soon as the object is created as constructor initializes the object.

// Default Constructor
// NOTE: A constructor is called a "Default Constructor" when it doesn't have any parameter
// NOTE: A constructor is just like a method(Function) in Java, but it does not have any return type. It can also be overloaded, just like other methods

/* IMP NOTE:-
It is not necessary to write a constructor for a class.
It is because java compiler creates a default constructor if your class doesn’t have any.
*/

// Create A Class
class Person {

  // Create Class Properties
  int age;
  String name;

  // Create Class Function
  void PersonDetail() {
    System.out.println("Your Age Is : " + age);
    System.out.println("Your Name Is : " + name);
  }
}

public class OOPsDefaultConstructor {

  public static void main(String[] args) {
    // Creating Object
    Person FirstPerson = new Person();
    // NOTE: Current Can Not Add Any Properties Value That Reason Can Not Show Any
    // Age And Name Value. Print Data Type Default Value.
    FirstPerson.PersonDetail();
  }
}
