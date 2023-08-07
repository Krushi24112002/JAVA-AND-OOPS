class Person {

  private String name;
  private int Age;

  void setname(String name) {
    this.name = name;
  }

  String getname() {
    return name;
  }

  void setAge(int Age) {
    this.Age = Age;
  }

  int getAge() {
    return Age;
  }
}

public class GetAndSetMethod {

  public static void main(String[] args) {
    Person p1 = new Person();

    p1.setname("KRUSHI");
    System.out.println("Your Name Is : " + p1.getname());

    p1.setAge(21);
    System.out.println("Your Age Is : " + p1.getAge());
  }
}
