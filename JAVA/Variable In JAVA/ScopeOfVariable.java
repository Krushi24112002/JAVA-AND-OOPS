/**
Some Important Points about Variable scope in Java:  
1) In general, a set of curly brackets { } defines a scope.
2) In Java we can usually access a variable as long as it was defined within the same set of brackets as the code we are writing or within any curly brackets inside of the curly brackets where the variable was defined.
3) Any variable defined in a class outside of any method can be used by all member methods.
4) When a method has the same local variable as a member, “this” keyword can be used to reference the current class variable.
5) For a variable to be read after the termination of a loop, It must be declared before the body of the loop.
 */
// Example 

public class ScopeOfVariable {

    public static void main(String[] args) {

        int x;
        for (x = 0; x < 8; x++) {
            System.out.println(x);
        }

    }
}