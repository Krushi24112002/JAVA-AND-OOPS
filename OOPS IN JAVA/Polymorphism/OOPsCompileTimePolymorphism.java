// Compile Time Polymorphism (Static Polymorphism)(Function Overloading)
/*
1.Method(Function) Overloading   
2.operator overloading <- NOTE: operator overloading is not supported by java.
*/

/*
Method(Function) overloading:-
when we have more than one function/method in the same class with the
same name and number of arguments. then these functions are known as
overloaded functions. Functions can be overloaded by a change in the
number of arguments or/and a change in the type of arguments.

Note:-different return type is not considered as overloading
*/

// Creating Class
class Helper {

  // Function 1 With 2 Integer Parameters And int return type.
  static int Multiply(int one, int two) {
    return one * two;
  }

  // Function 3 With Same Return Type Same Name But Number Of Parameters Are Different.
  static int Multiply(int one, int two, int three) {
    return one * two * three;
  }

  // Function 2 With Same Name But Different Argument Type Parameters And Different Return Type.
  static double Multiply(double one, double two) {
    return one * two;
  }
}

// Main Class
public class OOPsCompileTimePolymorphism {

  public static void main(String[] args) {
    System.out.println(Helper.Multiply(11, 11));
    System.out.println(Helper.Multiply(12, 12, 12));
    System.out.println(Helper.Multiply(11.5, 11.5));
  }
}
