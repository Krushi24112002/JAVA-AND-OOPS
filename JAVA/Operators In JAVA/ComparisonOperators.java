// Comparison Operators
/*
Comparison operators are used to compare two values.
This is important in programming, because it helps us to find answers and make decisions.

The return value of a comparison is either true or false. These values are known as Boolean values.

Operator	Name	                     Example
==	        Equal to	                 x == y	
!=	        Not equal	                 x != y	
>	        Greater than	             x > y	
<	        Less than	                 x < y	
>=	        Greater than or equal to	 x >= y	
<=	        Less than or equal to	     x <= y	

 */

public class ComparisonOperators {

    public static void main(String[] args) {

        int a = 45;
        int b = 34;

        System.out.println("Equal to " + (a == b));
        System.out.println("Not equal " + (a != b));
        System.out.println("Greater than " + (a > b));
        System.out.println("Less than " + (a < b));
        System.out.println("Greater than or equal to " + (a >= b));
        System.out.println("Less than or equal to " + (a <= b));
    }
}