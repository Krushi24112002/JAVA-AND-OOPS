public class OOPsWrapperClass {

    public static void main(String[] args) {

        int i = 24;

        // Autoboxing: Coverting Primitives into Object
        Integer intobj = i;

        // Printing Object
        System.out.println("Integer Object " + intobj);

        // UnBoxing: Converting Object into Primitives
        int intvalue = intobj;

        // Printing Primitives
        System.out.println("int Value " + intvalue);
    }
}