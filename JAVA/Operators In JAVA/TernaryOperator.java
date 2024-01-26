// Ternary Operator
/*

-> Ternary operator is a shorthand version of the if-else statement.
-> It has three operands and hence the name ternary.

-> The general format is:
   condition ? if true : if false

 */

public class TernaryOperator {

  public static void main(String[] args) {
    // Ternary Operator
    int a = 24;
    int b = 21;

    System.out.println("First Number " + a);
    System.out.println("Second NUmber " + b);

    int result = (a > b) ? a : b;
    System.out.println("Maximum Is " + result);
  }
}
