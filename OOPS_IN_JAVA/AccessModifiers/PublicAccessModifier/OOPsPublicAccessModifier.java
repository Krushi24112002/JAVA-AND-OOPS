// Public:- Declaration Are Visible EveryWhere.

class animal {

    public int age;

    void animaldetail() {
        System.out.println("Dog Age Is " + age);
    }
}

public class OOPsPublicAccessModifier {

    public static void main(String[] args) {

        animal obj = new animal();
        obj.age = 19;
        obj.animaldetail();

    }
}