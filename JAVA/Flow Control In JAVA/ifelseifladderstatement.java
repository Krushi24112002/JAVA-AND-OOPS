// if-else-if ladder
/*

-> a user can decide among multiple options.
-> The if statements are executed from the top down.
-> As soon as one of the conditions controlling the if is true, the statement associated with that if is executed, and the rest of the ladder is bypassed. 
-> If none of the conditions is true, then the final else statement will be executed.

Syntax :-

if (condition)
    statement;
else if (condition)
    statement;
.
.
else
    statement;

 */

public class ifelseifladderstatement {

    public static void main(String[] args) {

        int i = 20;

        if (i == 10) {
            System.out.println("I is 10");
        } else if (i == 15) {
            System.out.println("I is 15");
        } else if (i == 20) {
            System.out.println("I is 20");
        } else {
            System.out.println("I is Not Present");
        }
    }
}