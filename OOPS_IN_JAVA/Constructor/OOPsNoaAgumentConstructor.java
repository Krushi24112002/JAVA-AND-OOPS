class OOPsnoargumentconstructor {

    // Creating Class Properties
    int Age;
    String Name;

    // Creating No Argument Constructort

    OOPsnoargumentconstructor() {

        System.out.println("Constructor Called");
    }
}

public class OOPsNoaAgumentConstructor {

    public static void main(String[] args) {

        OOPsnoargumentconstructor obj = new OOPsnoargumentconstructor();
        System.out.println(obj.Age);
        System.out.println(obj.Name);
    }
}