// nested if statement
/*

-> A nested if is an if statement that is the target of another if or else.
-> Nested if statements mean an if statement inside an if statement.

Syntax: 

if (condition1) 
{
   // Executes when condition1 is true
   if (condition2) 
   {
      // Executes when condition2 is true
   }
}

 */

public class nestedifstatement {

  public static void main(String[] args) {
    int a = 24;
    int b = 24;

    if (a < b) {
      System.out.println("A Is Less Thank B");
    }
    if (a == b) {
      System.out.println("A is Equal To B ");
    } else {
      System.out.println("Else Statement");
    }
  }
}
