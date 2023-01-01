// Private: When Variables And Methods Are Declared Private , They Can Not Be Accessed Outside Of The Class.
// Private: Declaration Are Visible Within The Class Only.

class animal {

    // Private Variable
    private int age;

}

public class OOPsPrivateAccessModifier {

    public static void main(String[] args) {

        // Create Object Using New Keyword
        animal obj = new animal();
        obj.age = "16";
    }
}