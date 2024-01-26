/*
JAVA Type Casting

1.Widening Casting (automatically) - converting a smaller type to a larger type size
  byte -> short -> char -> int -> long -> float -> double

2.Narrowing Casting (manually) - converting a larger type to a smaller size type
  double -> float -> long -> int -> char -> short -> byte
 */

public class TypeCasting {

  public static void main(String[] args) {
    // Widening Casting (Automatically)
    int Myint = 24;
    float Myfloat = Myint;
    System.out.println("Before Widening Casting " + Myint);
    System.out.println("After Widening Casting " + Myfloat);

    // Narrowing Casting (manually)
    float float1 = 21.0F;
    int int1 = (int) float1;
    System.out.println("Before Narrowing Casting " + float1);
    System.out.println("After Narrowing Casting " + int1);
  }
}
