//  invoke the current class method(Function) Using This Keyword

// Creating Class
class Person {
    // Creating Class Function-1
    void FirstPerson() {
        System.out.println("Person Is Running");
    }

    // Creating Class Function-2
    void SecondPerson() {
        System.out.println("Person is working");

        // Call The FirstPerson() Using This Keyword
        this.FirstPerson();
    }
}

public class OOPsInvokeTheCurrentClassMethodUsingThisKeyword {

    public static void main(String[] args) {
        // Creating Object Using new KeyWord
        Person PersonDetail = new Person();
        PersonDetail.SecondPerson();
    }
}