// Encapsulation
// Definition : Wrapping Up Data Member And Function(Method)
/*
Encapsulation can be achieved by Declaring all the variables in the class as private and writing public methods in the class to set and get
the values of variables. 
 */
// Data Member -> Properties OR State
// Function -> Method OR Behavior
// NOTE: Fully Capsulated Class -> All Data Member(Properties) Are Private. Only Same Class Can Access This Data Mamber(Properties).

// Advantages of Encapsulation
// 1. Data Hiding/Information Hiding
// 2. Code Reusebality
// 3. Testing code is easy(Unit Testing)
// 3. Increased Flexibility

// Creating Class
class Encapsulation {

  // Creating Class Properties
  private String name;
  private String surname;
  private int age;

  String getname() {
    return name;
    // OR This Type Can Also Write
    // return this.name;
  }

  String getsurname() {
    return surname;
  }

  int getage() {
    return age;
  }

  void setname(String PersonName) {
    name = PersonName;
  }

  void setsurname(String PersonSurName) {
    surname = PersonSurName;
  }

  void setage(int PersonAge) {
    age = PersonAge;
  }
}

public class OOPsEncapsulation {

  public static void main(String[] args) {
    // Creating Class Object Using new KeyWord
    Encapsulation PersonDetail = new Encapsulation();
    PersonDetail.setname("KRUSHI");
    PersonDetail.setsurname("MONPARA");
    PersonDetail.setage(19);

    System.out.println("Your Name Is " + PersonDetail.getname());
    System.out.println("Your SurName Is " + PersonDetail.getsurname());
    System.out.println("Your Age Is " + PersonDetail.getage());
  }
}
