// Reference Variable

class Person {

  int age = 19;

  void Display() {
    System.out.println("Person Age Is " + age);
  }
}

public class OOPsReferanceVariable {

  public static void main(String[] args) {
    Person p1 = new Person();

    System.out.println(p1.age);

    p1.Display();
  }
}
