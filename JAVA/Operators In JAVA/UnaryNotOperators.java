// Unary Not(!) Operator
// This is used to convert true to false or vice versa. Basically, it reverses the logical state of an operand.

public class UnaryNotOperators {

  public static void main(String[] args) {
    boolean value = true;
    int num1 = 21, num2 = 24;

    System.out.println("Value Is " + value);
    System.out.println("First Number Is " + num1);
    System.out.println("Second Number Is " + num2);

    // Displaying values stored in above variables after applying unary NOT operator

    System.out.println("Now Value Is " + !value);
    System.out.println("!(a<b) " + !(num1 < num2));
    System.out.println("!(a>b) " + !(num1 > num2));
  }
}
