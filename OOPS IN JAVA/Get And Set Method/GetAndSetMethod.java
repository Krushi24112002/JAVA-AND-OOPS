class person {

  private int Age;

  private String Name;

  void setAge(int PersonAge) {
    this.Age = PersonAge;
  }

  void setName(String PersonName) {
    this.Name = PersonName;
  }

  int getAge() {
    return Age;
  }

  String getName() {
    return Name;
  }
}

public class GetAndSetMethod {

  public static void main(String[] args) {
    person obj = new person();

    obj.setAge(21);
    obj.setName("KRUSHI MONPARA");

    System.out.println("Your Age is " + obj.getAge());
    System.out.println("Your Age is " + obj.getName());
  }
}
