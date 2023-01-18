//  Exception occurs in try block and handled in catch block

public class trycatchfinallycase1 {

    public static void main(String[] args) {

        try {
            int[] arr = new int[4];
            arr[5] = 24;
            System.out.println("Inside try block");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught in Catch block");
        }

        // rest program will be executed
        System.out.println("Outside try-catch clause");
    }
}