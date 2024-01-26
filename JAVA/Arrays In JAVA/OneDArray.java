// One-Dimensional Arrays
/*

// Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
f
1) The general form of a one-dimensional array declaration is

data_type var-name[];
OR
data_type[] var-name;

2) allocating memory to array

data_type[] var_name = new data_type[Array_size];
OR
var_name = new data_type[Array_size];
 */

public class OneDArray {

  public static void main(String[] args) {
    int[] arr; // declaring array

    arr = new int[4]; // allocating memory to array

    int[] arr1 = new int[4]; // combining both statements in one

    /*
     * Array Literal
     *
     * -> In a situation where the size of the array and variables of the array are
     * already known, array literals can be used.
     */

    // Array Literal Example
    // int[] arr0 = new int[]{1,2,3,4,5,6,7,8,9,10};
    // OR Below Same Work.
    int[] arr0 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    for (int i = 0; i < arr0.length; i++) {
      System.out.println("Element at index " + i + " : " + arr0[i]);
    }

    // Accessing Java Array Elements using for Loop

    int[] arr2 = new int[5];
    arr2[0] = 10;
    arr2[1] = 20;
    arr2[2] = 30;
    arr2[3] = 40;
    arr2[4] = 50;

    for (int i = 0; i < arr2.length; i++) {
      System.out.println("Element at index " + i + " : " + arr2[i]);
    }
  }
}
