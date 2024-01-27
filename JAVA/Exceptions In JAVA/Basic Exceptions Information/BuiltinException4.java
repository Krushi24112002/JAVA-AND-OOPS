// NumberFormat Exception

public class BuiltinException4 {

  public static void main(String[] args) {
    try {
      int num = Integer.parseInt("Akki");
      System.out.print(num);
    } catch (NumberFormatException e) {
      System.out.print(" Number Format Exception ");
    }
  }
}
