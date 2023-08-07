// pass as an argument in the method Using This KeyWord

// NOTE: The this keyword can also be passed as an argument in the method(Function). It is mainly used in the event handling.

// Creating Class
class Person {

  // Creating Class Properties
  int age = 19;

  // Creating Class Function-1
  void fun1() {
    System.out.println("Hello Person");
    fun2(this);
  }

  // Creating Class Function-2
  void fun2(Person obj) {
    System.out.println("Your Age Is " + obj.age);
  }
}

public class OOPsPassAsAnArgumentInTheMethodUsingThisKeyword {

  public static void main(String[] args) {
    // Creating Object
    Person PersonDetail = new Person();
    PersonDetail.fun1();
  }
}
