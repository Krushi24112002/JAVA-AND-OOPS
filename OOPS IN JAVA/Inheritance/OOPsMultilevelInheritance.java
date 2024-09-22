// Multilevel inheritance in JAVA(OOPs)
// NOTE :- multiple inheritance is not supported in java?.

class Animal {

  void eat() {
    System.out.println("Eating...");
  }
}

class Dog extends Animal {

  void bark() {
    System.out.println("Barking...");
  }
}

class BabyDog extends Dog {

  void weep() {
    System.out.println("Weeping...");
  }
}

public class OOPsMultilevelInheritance {

  public static void main(String[] args) {
    
    Animal obj1 = new Animal();
    obj1.eat();

    Dog obj2 = new Dog();
    obj2.eat();
    obj2.bark();

    BabyDog obj3 = new BabyDog();
    obj3.eat();
    obj3.bark();
    obj3.weep();
  }
}
