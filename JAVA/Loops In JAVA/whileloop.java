// While Loop
/*
 
-> While loop starts with the checking of condition.
-> If it evaluated to true, then the loop body statements are executed otherwise first statement following the loop is executed.
-> For this reason it is also called Entry control loop.

Syntax :

while (Text_expression;)
{
    Statements...

    Update_expression;
}

 */

public class whileloop {

    public static void main(String[] args) {

        // initialization expression
        int i = 1;

        //test expression
        while (i < 5) {
            System.out.println("KRUSHI MONPARA");

            //update expression
            i++;
        }

    }
}
