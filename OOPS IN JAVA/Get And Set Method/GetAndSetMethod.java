class Person {

    private String name;

    String getname() {
        return name;
    }

    void setname(String name) {
        this.name = name;
    }
}

public class GetAndSetMethod {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setname("KRUSHI");
        System.out.println(p1.getname());

    }
}