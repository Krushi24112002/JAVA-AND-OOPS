package InputAndOutput.IO;
import java.util.Scanner;

public class InputAndOutput {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("Enter Your Name");
    String name = scn.next();

    System.out.println("Enter Your SurName");
    String surname = scn.next();

    System.out.println("Enter Your Age");
    int age = scn.nextInt();

    System.out.println("Your Name Is : " + name);
    System.out.println("Your SurName Is : " + surname);
    System.out.println("Your Age Is : " + age);
  }
}
