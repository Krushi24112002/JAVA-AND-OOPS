public class trycatchfinallyworking {

    public static void main(String[] args) {

        int a = 24;
        int b = 0;

        try {
            System.out.print(" Result " + a / b);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught:Division by zero");
        } finally {
            System.out.println("I am in final block");
        }

        // rest program will be executed
        System.out.println("Outside try-catch-finally clause");
    }
}