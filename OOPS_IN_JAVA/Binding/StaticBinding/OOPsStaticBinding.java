class Dog {
    void eat() {
        System.out.println("Dog Is Eating...");
    }
}

public class OOPsStaticBinding {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat();

    }
}