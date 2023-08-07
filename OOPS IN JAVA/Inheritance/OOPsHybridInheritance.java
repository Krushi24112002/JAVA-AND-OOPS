class GrandFather {

  void fun1() {
    System.out.println("I Am GrandFather");
  }
}

class Father extends GrandFather {

  void fun2() {
    System.out.println("I Am Father");
  }
}

class son extends Father {

  void fun3() {
    System.out.println("I Am Son");
  }
}

class Daughter extends Father {

  void fun4() {
    System.out.println("I Am Daughter");
  }
}

// Main Class
public class OOPsHybridInheritance {

  public static void main(String[] args) {
    GrandFather A = new GrandFather();
    A.fun1();

    Father B = new Father();
    B.fun1();
    B.fun2();

    son C = new son();
    C.fun3();
    C.fun2();
    C.fun1();

    Daughter D = new Daughter();
    D.fun4();
    D.fun2();
    D.fun1();
  }
}
