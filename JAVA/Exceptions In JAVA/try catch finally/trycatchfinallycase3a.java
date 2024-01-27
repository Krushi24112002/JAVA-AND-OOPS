// Exception doesn’t occur in try-block (Use Finally Block)

public class trycatchfinallycase3a {

  public static void main(String[] args) {
    try {
      String str = "2411";
      int num = Integer.parseInt(str);
      System.out.println("Inside try block");
    } catch (NumberFormatException e) {
      System.out.println("catch block executed...");
    } finally {
      System.out.println("finally block executed");
    }

    // rest program will not execute
    System.out.println("Outside try-catch clause");
  }
}
