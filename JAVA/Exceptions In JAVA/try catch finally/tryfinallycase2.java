// Exception not raised :- If an exception does not occur in try block then control flow will be finally block followed by rest of the program

public class tryfinallycase2 {

  public static void main(String[] args) {
    try {
      String str = "2411";
      int num = Integer.parseInt(str);
      System.out.println("Inside try block");
    } finally {
      System.out.println("finally block executed");
    }

    // rest program will be executed
    System.out.println("Outside try-finally clause");
  }
}
