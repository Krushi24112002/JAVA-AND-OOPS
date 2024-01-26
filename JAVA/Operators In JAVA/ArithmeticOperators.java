// Arithmetic Operators
/*

Arithmetic operators are used to perform common mathematical operations.

Operator	       Name	                           Description		
+	               Addition	                       Adds together two values	
-	               Subtraction	                   Subtracts one value from another	
*	               Multiplication	               Multiplies two values	
/	               Division	                       Divides one value by another	
%	               Modulus	                       Returns the division remainder		
++	               Increment	                   Increases the value of a variable by 1	
--	               Decrement	                   Decreases the value of a variable by 1

 */

public class ArithmeticOperators {

  public static void main(String[] args) {
    int a = 5;
    int b = 4;

    System.out.println("Addition " + (a + b));

    System.out.println("Subtraction " + (a - b));

    System.out.println("Multiplication " + (a * b));

    System.out.println("Division " + (a / b));

    System.out.println("Modulus " + (a % b));

    System.out.println("Increment " + a++);

    System.out.println("Decrement " + --b);
  }
}
