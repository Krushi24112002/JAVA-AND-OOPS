/*
Java has two categories in which data types are segregated.

1.Primitive Data Type:boolean, char, int, short, byte, long, float,double
2.Non-Primitive Data Type or Object Data type: String, Array, etc.

String - stores text, such as "Hello". String values are surrounded by double quotes
int - stores integers (whole numbers), without decimals, such as 123 or -123
float - stores floating point numbers, with decimals, such as 19.99 or -19.99
char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
boolean - stores values with two states: true or false

Data Type	Size	    Description

byte	   1 byte       Stores whole numbers from -128 to 127
 
short	   2 bytes      Stores whole numbers from -32,768 to 32,767     

int	       4 bytes      Stores whole numbers from -2,147,483,648 to 2,147,483,647     

long	   8 bytes      Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

float	   4 bytes      Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits

double	   8 bytes      Stores fractional numbers. Sufficient for storing 15 decimal digits

boolean	   1 bit        Stores true or false values
 
char	   2 bytes      Stores a single character/letter or ASCII values

 */

public class DataType {

  public static void main(String[] args) {
    // byte
    byte b = 24;
    System.out.println(b);

    // short
    short s = 21;
    System.out.println(s);

    // int
    int num = 34;
    System.out.println(num);

    // long
    long Mynum = 15000000L;
    System.out.println(Mynum);

    // float
    float val = 3.4F;
    System.out.println(val);

    // double
    double Sum = 19.99D;
    System.out.println(Sum);

    // Char
    char word = 'K';
    System.out.println(word);

    // Boolean
    Boolean isjavaisfun = true;
    System.out.println(isjavaisfun);

    // String
    String name = "KRUSHI MONPARA";
    System.out.println(name);
  }
}
