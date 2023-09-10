// #NOTE# Java does not support multiple inheritances due to prevent ambiguity

// Java Program to Illustrate Unsupportance of Multiple Inheritance
class Father {

  void fun() {
    System.out.println("I Am Father");
  }
}

class Son extends Father {

  void fun() {
    System.out.println("I Am Son");
  }
}

class Daughter extends Father {

  void fun() {
    System.out.println("I Am Daughter");
  }
}

// Main Class
public class OOPsMultipleInheritance {

  public static void main(String[] args) {
    Daughter obj = new Daughter();
    obj.fun();
  }
}
