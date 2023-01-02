// Invoke the immediate parent class method (Using Super Key Word)

// Creating Parent Class
class Animal {
    // Creating Parent Class Function
    void eat() {
        System.out.println("Eating");
    }
}

// Crating Sub Class
class Dog extends Animal {
    // Creating Sub Class Function
    void Bark() {
        System.out.println("Barking");
    }

    // Creating Print Function(Method)
    void AnimalDetail() {

        super.eat(); // Calling The Parent Class Function(Method)
        Bark(); // Calling The Sub Class Function(Method)
    }
}

public class OOPsInvokeTheImmediateParentClassMethodUsingSuperKeyword {
    public static void main(String[] args) {

        // Creating Object
        Dog d = new Dog();
        d.AnimalDetail();

    }
}
