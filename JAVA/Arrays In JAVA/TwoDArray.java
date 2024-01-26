// Two - Dimensional Arrays

/*
 
-> A multidimensional array is an array of arrays.

 The general form of a Two-dimensional array declaration is

data_type[][] var_name = new data_type[][];

 */

public class TwoDArray {

  public static void main(String[] args) {
    // declaring and initializing 2D array
    int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    // printing 2D array
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    // Same 2D Array Print With Diffrent Way

    System.out.println();

    int[][] arr1 = new int[3][3];

    arr1[0][0] = 1;
    arr1[0][1] = 2;
    arr1[0][2] = 3;

    arr1[1][0] = 4;
    arr1[1][1] = 5;
    arr1[1][2] = 6;

    arr1[2][0] = 7;
    arr1[2][1] = 8;
    arr1[2][2] = 9;

    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr1.length; j++) {
        System.out.print(arr1[i][j] + " ");
      }
      System.out.println();
    }
  }
}
