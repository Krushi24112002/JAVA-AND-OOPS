// Inheritance : Inheritance in java is a mechanism in which one class acquires all the properties and behaviors(Function) of a parent class.
// Total Three Modes In Inheritance
// 1. Public Mode
// 2. Protected Mode
// 3. Private Mode

/*

Base Class Member Access Specifier      Public             Protected                Private

1.     Public                           Public             Protected                Private
2.     Protected                        Protected          Protected                Private
3.     Private                          Not Accessible     Not Accessible           Not Accessible

*/

/* 
 Three Different Types Of Inheritance

 1.Single Inheritance
 2.Multi-level Inheritance
 3.Hierarchical Inheritance

*/

// Creating Class
// Creating Parent Class/Super Class

class Human {

  // Creating Class Properties
  private int Height;
  private int Weight;
  private int Age;

  int getHeight() {
    return Height;
  }

  int getWeight() {
    return Weight;
  }

  int getAge() {
    return Age;
  }

  void setHeight(int PersonHeight) {
    Height = PersonHeight;
  }

  void setWeight(int PersonWeight) {
    Weight = PersonWeight;
  }

  void setAge(int PersonAge) {
    Age = PersonAge;
  }
}

// Creating Sub Class/Child Class
class male extends Human {

  // Creating Child Class Properties
  public String color;

  // Creating Child Class Function(Method)
  void sleep() {
    System.out.println("Male Sleeping");
  }
}

public class OOPsInheritance {

  public static void main(String[] args) {
    // Creating Parent Class Object Using New KeyWord
    Human Inheritance = new Human();

    Inheritance.setHeight(5);
    Inheritance.setWeight(55);
    Inheritance.setAge(20);

    System.out.println("Your Height Is " + Inheritance.getHeight());
    System.out.println("Your Wight Is " + Inheritance.getWeight());
    System.out.println("Your Age Is " + Inheritance.getAge());

    System.out.println();

    // Creating Child Class Object Using New KeyWord
    male object1 = new male();

    object1.setHeight(6);
    object1.setWeight(45);
    object1.setAge(22);

    object1.color = "white";

    System.out.println("Your Height Is " + object1.getHeight());
    System.out.println("Your Height Is " + object1.getHeight());
    System.out.println("Your Age is " + object1.getAge());
    System.out.println("Your Color is " + object1.color);
    object1.sleep();
  }
}
