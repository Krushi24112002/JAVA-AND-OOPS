// Assignment Operators
/*

Assignment operators are used to assign values to variables.

Operator	Example	Same As
=	        x = 5	x = 5	
+=	        x += 3	x = x + 3	
-=	        x -= 3	x = x - 3	
*=	        x *= 3	x = x * 3	
/=	        x /= 3	x = x / 3	
%=	        x %= 3	x = x % 3	
&=	        x &= 3	x = x & 3	
|=	        x |= 3	x = x | 3	
^=	        x ^= 3	x = x ^ 3	
>>=	        x >>= 3	x = x >> 3	
<<=	        x <<= 3	x = x << 3

 */

public class AssignmentOperators {

  public static void main(String[] args) {
    int a = 45;
    System.out.println(a);

    int a1 = 5;
    a1 = a1 + 3;
    System.out.println(a1);

    int a2 = 5;
    a2 = a2 - 3;
    System.out.println(a2);

    int a3 = 5;
    a3 = a3 * 3;
    System.out.println(a3);

    int a4 = 5;
    a4 = a4 / 3;
    System.out.println(a4);

    int a5 = 5;
    a5 = a5 % 3;
    System.out.println(a5);

    int a6 = 5;
    a6 = a6 & 3;
    System.out.println(a6);

    int a7 = 5;
    a7 = a7 | 3;
    System.out.println(a7);

    int a8 = 5;
    a8 = a8 ^ 3;
    System.out.println(a8);

    int a9 = 5;
    a9 = a9 >> 3;
    System.out.println(a9);

    int a10 = 5;
    a10 = a10 << 3;
    System.out.println(a10);
  }
}
