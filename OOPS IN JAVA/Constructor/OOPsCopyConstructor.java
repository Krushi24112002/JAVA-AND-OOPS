// Java Copy Constructor By Constructor
// Here we are copying the values from one object to the other using the copy constructor

// Creating Class
class Person {

  // Creating Class Properties
  String name;
  int age;

  // Creating Parameterized Constructor
  Person(String PersonName, int PersonAge) {
    name = PersonName;
    age = PersonAge;
  }

  // Creating Copy Constructer
  Person(Person c) {
    System.out.println("Copy Constructor Called");

    name = c.name;
    age = c.age;
  }

  // Creating Class Function
  void PersonDetail() {
    System.out.println("Your Name Is " + name + " " + "Your Age Is " + age);
  }
}

public class OOPsCopyConstructor {

  public static void main(String[] args) {
    // Creating Object
    Person FirstPerson = new Person("KRUSHI", 19);

    Person SecondPerson = new Person(FirstPerson);

    Person ThirdPerson = new Person(SecondPerson);

    ThirdPerson.PersonDetail();
  }
}
