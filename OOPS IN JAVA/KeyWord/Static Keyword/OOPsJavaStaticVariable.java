//  Static Variable (also known as a class variable)

/*
1. The static variable will be shared among all the objects of the class (which is not unique for each object).
2. Memory is allocated to the static variable only once in the class area at the time of class loading.
*/
// Advantages of Static Variable
// 1.It makes your program memory efficient (i.e., it saves memory).

// Creating Class
class Student {

    // Creating Class Properties
    String name;
    int RollNumber;
    // Creating Static Variable
    static String College = "IIT";

    // Craeting Parameterized Constructor
    Student(String StudentName, int StudentRollNumber) {
        name = StudentName;
        RollNumber = StudentRollNumber;
    }

    // Creating Print Class Function
    void StudentDetail() {
        System.out.println(name + " " + RollNumber + " " + College);
    }

}

public class OOPsJavaStaticVariable {

    public static void main(String[] args) {

        // Creating Object
        Student s1 = new Student("KRUSHI", 24);
        Student s2 = new Student("ASHRUTA", 21);

        s1.StudentDetail();
        s2.StudentDetail();

        s1.College = "MIT";

        System.out.println("s1 Changed The College Name Now Let Us See Is It Changed For s2 Also ?");
        s1.StudentDetail();
        s2.StudentDetail();
        System.out.println("Yes , if Any Object Change That Variable That Changes Will Be Reflacted To All Objects");

    }

}
