// Default Access Modifier
/*

-> When no access modifier is specified for a class, method, or data member – It is said to be having the default access modifier by default. 
-> having default access modifier are accessible only within the same package.

 */

// Creating Class
class Person {

    // Creating Properties
    int Age;
    String Name;

    // Creating Method
    void PersonDetail() {
        System.out.println("Your Name Is " + Name);
        System.out.println("Your Age Is " + Age);
    }
}

// Creating Main Class
public class DefaultAccessModifier {

    public static void main(String[] args) {

        // Creating Object Using New KeyWord
        Person s = new Person();
        s.Age = 20;
        s.Name = "KRUSHI MONPARA";
        s.PersonDetail();
    }
}
