// if else Statement
/*
 
-> The if statement alone tells us that if a condition is true it will
   execute a block of statements and if the condition is false it won’t.
-> But what if we want to do something else if the condition is false. Here
   comes the else statement.
-> We can use the else statement with if statement to execute a block of code
   when the condition is false.
 
Syntax: 

if (condition)
{
    // Executes this block if condition is true
}
else
{
    // Executes this block if condition is false
}

 */

public class ifelsestatement {

    public static void main(String[] args) {

        int a = 21;
        int b = 24;

        if (a > b) {
            System.out.println("A Is Grater Than B ");
        } else {
            System.out.println("A Is Less Than B ");
        }
    }
}