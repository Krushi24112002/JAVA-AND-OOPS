
public class OOPsJavaStaticClass {

    // Creating static nested Class
    static class MyNestedClass {

        String Name;
        int Age;

        void Detail() {
            System.out.println("Your Name is " + Name);
            System.out.println("Your Age Is " + Age);
        }
    }

    public static void main(String[] args) {

        OOPsJavaStaticClass.MyNestedClass obj = new OOPsJavaStaticClass.MyNestedClass();
        obj.Name = "KRUSHI MONPARA";
        obj.Age = 20;
        obj.Detail();

    }
}
