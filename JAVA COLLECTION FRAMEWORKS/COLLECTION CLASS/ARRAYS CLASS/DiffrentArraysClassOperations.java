// Arrays Class

import java.util.Arrays;

public class DiffrentArraysClassOperations {

    public static void main(String[] args) {

        int[] arr = { 10, 34, 8, 56, 12, 24, 11 };

        // Arrays.sort() :- Sorts the complete array in ascending order.

        Arrays.sort(arr);

        System.out.println("Sort Complete Array in Ascending Order = " + Arrays.toString(arr));

        int[] arr1 = { 10, 34, 8, 21, 5, 12, 78, 90 };

        // sort(originalArray, fromIndex, endIndex) :- Sorts the specified range of
        // array in ascending order.

        Arrays.sort(arr1, 2, 5);

        System.out.println("Sort Array Between Specific Given Rang = " + Arrays.toString(arr1));

        // binarySearch() :- This methods search for the specified element in the array
        // with the help of the binary search algorithm.

        int[] arr2 = { 10, 14, 18, 20, 24, 28, 34, 56 };

        // Find Key
        int Key = 24;
        System.out.println("Key Is " + Arrays.binarySearch(arr2, Key)); // Return Key Index

        // compare(array 1, array 2) :- Compares two arrays passed as parameters
        // lexicographically.

        int[] arr3 = { 10, 12, 45, 9, 34, 20, 11 };
        int[] arr4 = { 10, 12, 9, 20 };

        System.out.println("Comapre Both Arrays = " + Arrays.compare(arr3, arr4));

        // copyOf(originalArray, newLength) :- Copies the specified array, truncating or
        // padding with the default value (if necessary) so the copy has the specified
        // length.

        int[] arr5 = { 10, 40, 20, 30, 50 };

        System.out.println("Original Array Is = " + Arrays.toString(arr5));

        System.out.println("New Array Copy Using copyOf() Method ");

        System.out.println("Copy Array Is = " + Arrays.toString(Arrays.copyOf(arr5, 8)));

        // copyOfRange(originalArray, fromIndex, endIndex) :- Copies the specified range
        // of the specified array into a new Arrays.

        System.out.println("Copy Array Between Specific Range = " + Arrays.toString(Arrays.copyOfRange(arr5, 1, 4)));

        int[] arr6 = { 10, 12, 45, 9, 34, 20, 11 };
        int[] arr7 = { 10, 45, 34, 11 };

        // equals() :- Checks if both the arrays are equal or not.
        System.out.println("Both Array Are Equal Or Not = " + Arrays.equals(arr6, arr7));

        int[] arr8 = { 34, 12, 56, 78, 21, 24, 91 };

        // fill(originalArray, fillValue) :- Assigns this fill value to each index of
        // this arrays.

        int key1 = 24;
        Arrays.fill(arr8, key1);
        System.out.println("New Fill Array Is = " + Arrays.toString(arr8));

        // hashCode() :- Returns an integer hashCode of this array instance.

        System.out.println("HashCode is = " + Arrays.hashCode(arr8));

        int[] arr9 = { 34, 12, 56, 78, 21, 24, 91 };
        int[] arr10 = { 34, 12, 78, 91 };

        // mismatch(array1, array2) :- Finds and returns the index of the first
        // unmatched element between the two specified arrays.

        System.out.println("The element mismatched at index: " + Arrays.mismatch(arr9, arr10));

    }
}