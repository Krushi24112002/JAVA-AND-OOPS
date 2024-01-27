// ArrayIndexOutOfBounds Exception

public class BuiltinException5 {

  public static void main(String[] args) {
    try {
      int[] arr = new int[4];
      arr[5] = 24;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.print("Array Index is Out Of Bounds");
    }
  }
}
