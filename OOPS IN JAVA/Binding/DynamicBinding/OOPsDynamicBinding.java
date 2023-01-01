class Animal {

    void eat() {
        System.out.println("Animal Is Eating...");
    }
}

class Dog extends Animal {

    void eat() {
        System.out.println("Dog Is Eating...");
    }
}

public class OOPsDynamicBinding {

    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();
    }
}