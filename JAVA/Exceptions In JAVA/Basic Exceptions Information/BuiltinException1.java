// Arithmetic exception

public class BuiltinException1 {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.print("Can't divide a number by 0");
        }
    }
}