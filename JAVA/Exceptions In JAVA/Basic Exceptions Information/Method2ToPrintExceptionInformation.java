// toString()

// toString() Mrthod :- This method prints exception information in the format of Name of the exception: description of the exception.

// program to print the exception information using toString() method

public class Method2ToPrintExceptionInformation {

  public static void main(String[] args) {
    int a = 10;
    int b = 0;
    try {
      System.out.print(a / b);
    } catch (ArithmeticException e) {
      System.out.print(e.toString());
    }
  }
}
