class Person {

  private String name;

  String getname() {
    return name;
  }

  void setname(String n) {
    this.name = n;
  }
}

public class OOPsPrivateAccess {

  public static void main(String[] args) {
    Person p = new Person();
    p.setname("KRUSHI");
    System.out.println("Your Name Is " + p.getname());
  }
}
