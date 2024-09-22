// Protected :- When Method And Data Members Are Declared Protected, We Can Access Then Within The Same Package As Well As From Subclasses.

class animal {
    // Protected Variable
    protected int age;

    // Create Function
    void animaldetail() {
        System.out.println("Dog Age Is " + age);
    }

}

public class OOPsProtectedAccessModifier {

    public static void main(String[] args) {

        animal obj = new animal();
        obj.age = 23;
        obj.animaldetail();
    }
}