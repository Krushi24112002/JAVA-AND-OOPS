// #NOTE# Java does not support multiple inheritances due to prevent ambiguity

// Java Program to Illustrate Unsupportance of Multiple Inheritance
class Father {

  void fun() {
    System.out.println("I Am Father");
  }
}

class Son {

  void fun() {
    System.out.println("I Am Son");
  }
}

class Daughter {

    void fun() {
        System.out.println("I Am Daughter");
    }
}

class Test extends Son,Daughter {

}
// Main Class
public class OOPsMultipleInheritance {

    public static void main(String[] args) {
        
        Test t = new Test();
        t.fun();
    }
}