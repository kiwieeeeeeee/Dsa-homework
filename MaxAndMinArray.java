public class MaxMinArray {
    public static void main(String[] args) {
        // Hardcoded array
        int[] arr = {12, 45, 7, 23, 89, 5, 34};

        // Initialize max and min with the first element
        int max = arr[0];
        int min = arr[0];

        // Loop through the array to find max and min
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Display results
        System.out.println("Array elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
