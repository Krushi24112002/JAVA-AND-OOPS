public class OOPsCopyArray {

    public static void main(String[] args) {

        // Intialize Array
        int[] arr1 = new int[] { 1, 2, 3, 4 };

        // Creating Another Array arr2 With Size of arr1

        int[] arr2 = new int[arr1.length];

        // Copying All Elements Of One Array Into Another Array

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        // Displaying Elements of Array arr1
        System.out.println("Elements of Array 1 Orignal Arrya : ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i] + "");
        }

        System.out.println();

        // Displaying Elements of Array arr2
        System.out.println("Elements of Array 2 Copy Array : ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i] + "");

        }
    }
}