class Person {

    protected String name = "KRUSHI";
}

class Student extends Person {

}

public class OOPsProtectedAccess {

    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.name);
    }
}