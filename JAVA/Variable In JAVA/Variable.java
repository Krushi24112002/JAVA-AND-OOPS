// Variable in Java is a data container that saves the data values during Java program execution.

/*
1.The value stored in a variable can be changed during program execution.
2.A variable is only a name given to a memory location. All the operations done on the variable affect that memory location.
3.In Java, all variables must be declared before use.

 # How to declare variables?

1. datatype: Type of data that can be stored in this variable. 

2. data_name: Name given to the variable. 

In this way, a name can only be given to a memory location. It can be assigned values in two ways: 

Variable Initialization
Assigning value by taking input

 # How to initialize variables?

It can be perceived with the help of 3 components that are as follows:

datatype: Type of data that can be stored in this variable.
variable_name: Name given to the variable.
value: It is the initial value stored in the variable.

Example :- int num = 24;

 # Types of Variables in Java

 1.Local Variables
 2.Instance Variables
 3.Static Variables

 # Rules Of Variable Naming

Names can contain letters, digits, underscores, and dollar signs
Names must begin with a letter
Names should start with a lowercase letter and it cannot contain whitespace
Names can also begin with $ and _ (but we will not use it in this tutorial)
Names are case sensitive ("myVar" and "myvar" are different variables)
Reserved words (like Java keywords, such as int or boolean) cannot be used as names

 */

public class Variable {
    public static void main(String[] args) {

        int num = 24;
        System.out.println(num);

        int n1;
        n1 = 21;
        System.out.println(n1);

        // Change the value of myNum from 15 to 20:

        int myNum = 15;
        myNum = 20;
        System.out.println(myNum);

        String FirstName = "KRUSHI";
        String LastName = "MONPARA";
        String FullName = FirstName + " " + LastName;
        System.out.println(FullName);

        int x = 2;
        int y = 3;
        int z = 4;
        System.out.println(x + y + z);

        int A = 2, B = 3, C = 4;
        System.out.println(A + B + C);

    }
}
