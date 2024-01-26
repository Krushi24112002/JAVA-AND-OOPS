// Continue Statement

public class Continuestatement {

  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      // Check condition for continue
      if (i == 4 || i == 8) {
        // Using continue statement to skip the execution of loop when i==4 or i==8
        continue;
      }
      System.out.print(i + " ");
    }
  }
}
