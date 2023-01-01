// Multi-level Inheritance

// Creating calss A
class Animal {

    // Creating Class A Properties
    int Weight;
    int Age;

    // Creating Class A Function
    void AnimalDetails() {
        System.out.println("GermanShepherd Weight Is " + Weight);
        System.out.println("GermanShepherd Age Is " + Age);
    }
}

// Creating Class B
class Dog extends Animal {

}

// Creating Class C
class GermanShepherd extends Dog {

}

public class OOPsMultilevelInheritance {

    public static void main(String[] args) {

        // Creating Class C Object Using New KeyWord
        GermanShepherd obj1 = new GermanShepherd();

        obj1.Weight = 90;
        obj1.Age = 34;

        obj1.AnimalDetails();

    }
}
