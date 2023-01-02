// Static Method(Function)
/*
If you use a static keyword with any method(Function), it is called a static method(Function).
1.A static method belongs to the class rather than the object of a class.
2.A static method can access static data members and can change the value of it.
*/

// Restrictions for the static method(Function)
/*
1. The static method cannot use non-static data members or call the non-static method directly
2. this and super cannot be used in a static context.

Example:
class student{
    int studentID = 24; // non static

    public static void main(String[] args){
        System.out.println(studentID);
    }
}

OUTPUT:

output is error
*/
// NOTE:Static Methode(Function) Not Required Object.
/* NOTE:The static members are the property of the class as a whole.There is no need for specific objects to call static members.
Those can be called directly or with the class name.*/

// Creating Class
class Calculate {

    // Creating Static Methode(Function)
    static int cube(int x) {
        return x * x * x;
    }
}

public class OOPsJavaStaticMethod {

    public static void main(String[] args) {

        System.out.println("Your Cube Value Is " + Calculate.cube(24));

    }
}