// Pssing Object To Method

// Creatng Class
class ObjectPassDemo {

    // Creating Class Properties
    int a;
    int b;

    // Creating Constructor
    ObjectPassDemo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Creating Class Function(Method)
    boolean equalTo(ObjectPassDemo e) {

        // Object is Passed As An Argument To Method
        // return (o.a);
        return (e.a == a && e.b == b);
    }
}

public class OOPsPassingObjectToMethod {

    public static void main(String[] args) {

        ObjectPassDemo obj1 = new ObjectPassDemo(100, 22);
        ObjectPassDemo obj2 = new ObjectPassDemo(100, 22);
        ObjectPassDemo obj3 = new ObjectPassDemo(-1, -1);

        System.out.println("obj1 == obj2 " + obj1.equalTo(obj2));
        System.out.println("obj1 == obj3 " + obj1.equalTo(obj3));

    }
}