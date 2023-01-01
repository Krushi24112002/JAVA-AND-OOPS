// Unary Increment(+) Operator
// It is used to increment the value of an integer. It can be used in two separate ways: 

/*

1) Post-increment operator
-> When placed after the variable name, the value of the operand is incremented but the previous value is retained temporarily until the execution of this statement and it gets updated before the execution of the next statement. 

Syntax :- num++

2) Pre-increment operator
-> When placed before the variable name, the operand’s value is incremented instantly.

Syntax :- ++num

 */
// Example

public class UnaryIncrementOperator {

    public static void main(String[] args) {

        // Post-increment operator
        int num1 = 24;
        System.out.println(num1++);

        // Pre-increment operator
        int num2 = 21;
        System.out.println(++num2);
    }
}