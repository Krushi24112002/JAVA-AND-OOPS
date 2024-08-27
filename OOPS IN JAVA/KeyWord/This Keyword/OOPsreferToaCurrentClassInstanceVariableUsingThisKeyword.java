
// Refer To a Current Class Instance Variable Using This Keyword

// Creating Class
class student {

    // Creating Class Properties
    String Name;
    int RollNumber;
    String College;

    // Creating Parameterize Constructor
    student(String Name, int RollNumber, String College) {
        this.Name = Name;
        this.RollNumber = RollNumber;
        this.College = College;
    }

    // Creating Class Print Function
    void StudentDetail() {
        System.out.println("Your Name Is " + Name);
        System.out.println("Your College Name Is " + College);
        System.out.println("Your Roll Number Is " + RollNumber);
    }
}

public class OOPsreferToaCurrentClassInstanceVariableUsingThisKeyword {

    public static void main(String[] args) {

        // Creating Object
        student s1 = new student("KRUSHI", 37, "SPB PATEL ENGINEERING COLLEGE");
        s1.StudentDetail();
    }
}