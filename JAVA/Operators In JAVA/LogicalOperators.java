// Logical Operators

/*
 
-> You can also test for true or false values with logical operators.
-> Logical operators are used to determine the logic between variables or values:

Operator	Name	              Description	                                            Example
&& 	        Logical and	          Returns true if both statements are true	                x < 5 &&  x < 10	
|| 	        Logical or	          Returns true if one of the statements is true	            x < 5 || x < 4	
!	        Logical not	          Reverse the result, returns false if the result is true	!(x < 5 && x < 10)

 */

public class LogicalOperators {

  public static void main(String[] args) {
    int a = 4;
    System.out.println("Logical and Operation " + (a > 5 && a < 6));
    System.out.println("Logical or Operation " + (a > 5 || a < 6));
    System.out.println("Logical not Operation " + !(a > 5 || a < 6));
  }
}
