public class ReverseArray {
    public static void main(String[] args) {
        // Hardcoded array
        int[] arr = {10, 20, 30, 40, 50};

        // Display original array
        System.out.println("Original Array:");
        displayArray(arr);

        // Reverse the array
        reverseArray(arr);

        // Display reversed array
        System.out.println("Reversed Array:");
        displayArray(arr);
    }

    // Function to reverse array in-place
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to display array
    public static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
