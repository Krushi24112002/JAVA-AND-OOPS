// Exception occurred in try-block is not handled in catch block (Use Finally Block)

public class trycatchfinallycase2a {

    public static void main(String[] args) {

        try {
            int[] arr = new int[4];
            arr[5] = 24;
            System.out.println("Inside try block");
        } catch (NullPointerException e) {
            System.out.println("Exception has been caught");
        } finally {
            System.out.println("finally block executed ");
        }

        // rest program will not execute
        System.out.println("Outside try-catch clause");

    }
}