// Exception raised :- If an exception has occurred in try block then control flow will be finally block followed by default exception handling mechanism.

public class tryfinallycase1 {

    public static void main(String[] args) {

        try {
            int[] arr = new int[4];
            arr[5] = 21;
            System.out.print("Inside try block");
        } finally {
            System.out.println("finally block executed");
        }

        // rest program will not execute
        System.out.println("Outside try-finally clause");
    }
}