// Method (Function)
/*

-> A method is a block of code which only runs when it is called.
-> You can pass data, known as parameters, into a method.
-> Methods are used to perform certain actions, and they are also known as functions.
-> Why use methods? To reuse code: define the code once, and use it many times.

# Parameters and Arguments in Method(Function)
-> Information can be passed to methods as parameter. Parameters act as variables inside the method.
-> Parameters are specified after the method name, inside the parentheses.
-> You can add as many parameters as you want, just separate them with a comma.

# Return Values
-> The void keyword, indicates that the method should not return a value.
->  If you want the method to return a value, you can use a primitive data type (such as int, char, etc.) instead of void, and use the return keyword inside the method:
 */

public class method {

    // Method (Fucntion) Example
    static void MyMethod() {
        System.out.println("This Is A Method");
    }

    // Parameters and Arguments in Method(Function) #pass Same Data Type Parameters
    // In Method
    static void Mymethod1(String FirstName, String LastName) {
        System.out.println("Your First Name Is " + FirstName);
        System.out.println("Your Last Name IS " + LastName);
    }

    // Parameters and Arguments in Method(Function) #pass Diffrent Data Typr
    // Parameters In Method
    static void Mymethod2(String Name, int Age) {
        System.out.println("Your Name Is " + Name + "." + "Your Age Is " + Age + ".");
    }

    // Return Value
    static int Mymethod3(int x, int y) {
        return x + y;
    }

    // Return Value
    static String Mymethod4(String Car) {
        return Car;
    }

    // A Method with If...Else
    static void CheckAge(int Age) {

        if (Age < 18) {
            System.out.println("Access denied - You are not old enough!");
        } else {
            System.out.println("Access granted - You are old enough!");
        }

    }

    public static void main(String[] args) {

        // Call Method(Function)
        MyMethod();

        Mymethod1("KRUSHI", "MONPARA");

        Mymethod2("KRUSHI", 20);

        System.out.println("Your Number Sum Is " + Mymethod3(5, 3));

        System.out.println("Your Car Name Is " + Mymethod4("Audi"));

        CheckAge(19);

    }
}