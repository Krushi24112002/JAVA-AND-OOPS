// getMessage()

// getMessage() Method :- This method prints only the description of the exception.

// program to print the exception information using getMessage() method

public class Method3ToPrintExceptionInformation {

  public static void main(String[] args) {
    int a = 10;
    int b = 0;
    try {
      System.out.println(a / b);
    } catch (ArithmeticException e) {
      System.out.print(e.getMessage());
    }
  }
}
