// Allocating memory using new() Keyword

class Test {

  void print() {
    System.out.println("Test::show() called");
  }
}

public class Example1MM {

  public static void main(String[] args) {
    // all objects are dynamically allocated
    Test t = new Test();

    t.print();
  }
}
