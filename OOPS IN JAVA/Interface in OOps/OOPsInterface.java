// An Interface In Java Is A BluePrint Of A Class.
// The Interface In Java is a Mechanism To Achieve Abstraction.

// Advantages Of Interface
// 1. It Is Used To Achieve Abstraction.
// 2. By Interface We Can Support The Functionality Of Multiple Inheritance.

interface Bank {
    float rateOfInterest();
}

class SBI implements Bank {
    public float rateOfInterest() {
        return 9.15f;
    }
}

class BOB implements Bank {
    public float rateOfInterest() {
        return 9.7f;
    }
}

public class OOPsInterface {

    public static void main(String[] args) {

        Bank obj1 = new SBI();
        Bank obj2 = new BOB();
        System.out.println("ROI : " + obj1.rateOfInterest());
        System.out.println("ROI : " + obj2.rateOfInterest());
    }
}