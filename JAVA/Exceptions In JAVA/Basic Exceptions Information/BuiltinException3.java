// StringIndexOutOfBound Exception

public class BuiltinException3 {

  public static void main(String[] args) {
    try {
      String str = "Hello Krushi"; // length is 11
      char c = str.charAt(12);
      System.out.print(c);
    } catch (StringIndexOutOfBoundsException e) {
      System.out.print("String Index Out Of Bounds Exception");
    }
  }
}
