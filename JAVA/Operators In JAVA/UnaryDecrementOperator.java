// Unary Decrement(-) Operator
// It is used to decrement the value of an integer. It can be used in two separate ways:

/*
 
1) Post-decrement operator
-> When placed after the variable name, the value of the operand is decremented but the previous values is retained temporarily until the execution of this statement and it gets updated before the execution of the next statement. 

Syntax :- 
 num--

2) Pre-decrement operator
-> When placed before the variable name, the operand’s value is decremented instantly. 

Syntax :-
  --num

 */
// Example :-

public class UnaryDecrementOperator {

  public static void main(String[] args) {
    // Post-decrement operator
    int num1 = 24;
    System.out.println(num1--);

    // Pre-decrement operator
    int num2 = 21;
    System.out.println(--num2);
  }
}
