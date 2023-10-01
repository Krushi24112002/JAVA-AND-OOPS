// Rum Time Polymorphism (Dynamic Method Dispatch)(Function Overriding)
/*
1.Method(Function) overriding
In a simple language, when we have two classes, one is child class, and the
other is parent class, and when we write the same function in both the
child class and the parent class, the method is said to be overridden. This
concept is known as runtime polymorphism because the compiler will
decide at runtime to which function it will call during the program's
execution.
*/

// Rules for method(Function) overriding:
/*
1. The parent class method and the method of the child class must have the same name.
2. The parent class method and the method of the child class must have the same parameters.
3. It is possible through inheritance only
*/

// Creating Parent Class
class Human {

  // Creating Parent Class Function(Method)
  void speak() {
    System.out.println("Human Are Able To Speak");
  }
}

// Creating Sub Class
class Dog extends Human {

  // Creating Sub Class Function(Method)
  void speak() {
    System.out.println("Dog Are Able To Bark");
  }
}

// Main Class
public class OOPsRumTimePolymorphism {

  public static void main(String[] args) {
    Human h;
    h = new Human();
    h.speak();

    h = new Dog();
    h.speak();
  }
}
