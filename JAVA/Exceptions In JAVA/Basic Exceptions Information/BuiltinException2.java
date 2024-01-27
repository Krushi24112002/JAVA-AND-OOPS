// NullPointer Exception

public class BuiltinException2 {

  public static void main(String[] args) {
    String a = null;
    try {
      System.out.println(a.length());
    } catch (NullPointerException e) {
      System.out.print(" Null Pointer Exception ");
    }
  }
}
