class Person {

    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getname() {
        return name;
    }

    int getage() {
        return age;
    }

}

public class OOPsimmutableclass {

    public static void main(String[] args) {

        Person p = new Person("KRUSHI", 19);
        System.out.println("Name " + p.getname());
        System.out.println("Age " + p.getage());
    }
}