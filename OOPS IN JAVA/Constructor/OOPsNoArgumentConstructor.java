class OOPsnoargumentconstructor {

    // Creating Class Properties
    int Age;
    String Name;

    // Creating No Argument Constructor

    OOPsnoargumentconstructor() {

        System.out.println("Constructor Called");
    }
}

public class OOPsNoArgumentConstructor {

    public static void main(String[] args) {

        OOPsnoargumentconstructor obj = new OOPsnoargumentconstructor();

        obj.Age = 20;
        obj.Name = "KRUSHI MONPARA";
        System.out.println("Your Age Is " + obj.Age);
        System.out.println("Your Name Is " + obj.Name);
    }
}