// Relational Operators

/*
1) ==, Equal to returns true if the left-hand side is equal to the right-hand side.
2) !=, Not Equal to returns true if the left-hand side is not equal to the right-hand side.
3) <, less than: returns true if the left-hand side is less than the right-hand side.
4) <=, less than or equal to returns true if the left-hand side is less than or equal to the right-hand side.
5) >, Greater than: returns true if the left-hand side is greater than the right-hand side.
6) >=, Greater than or equal to returns true if the left-hand side is greater than or equal to the right-hand side.

 */

public class RelationalOperators {

  public static void main(String[] args) {
    // == (Equal To)
    int num1 = 21;
    int num2 = 21;
    System.out.println(num1 == num2);

    // != (Not Equal To)
    int num3 = 21;
    int num4 = 24;
    System.out.println(num3 != num4);

    // < (Less Than)
    int num5 = 21;
    int num6 = 24;
    System.out.println(num5 < num6);

    // <= (Less Than Equal To)
    int num7 = 21;
    int num8 = 21;
    System.out.println(num7 <= num8);

    // > (Greater Than)
    int num9 = 24;
    int num10 = 21;
    System.out.println(num9 > num10);

    // >= (Greater Than Equal To)
    int num11 = 24;
    int num12 = 24;
    System.out.println(num11 >= num12);
  }
}
