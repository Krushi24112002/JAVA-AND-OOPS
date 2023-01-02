// Refer to the immediate parent class variable  (Using Super Keyword)

// Creating Parent Class
class Animal {

    // Creating Parent Class Properties
    String color = "WHITE";
}

// Creating Sub Class
class Dog extends Animal {

    // Creating Sub Class Properties
    String color = "BLACK";

    // Creating Class Print Function
    void PrintColor() {
        System.out.println(super.color); // Print Color Of Animal Class(Parent Class)
        System.out.println(color);// Print Color of Dog Class(Sub Class)
    }

}

public class OOPsReferToTheImmediateParentClassVariableUsingSuperKeyword {
    public static void main(String[] args) {

        // Creating Object Using new KeyWord
        Dog d = new Dog();
        d.PrintColor();

    }
}
