import java.util.Scanner;

public class ArrayInsertDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initial array
        int n;
        System.out.print("Enter size of array: ");
        n = sc.nextInt();
        int[] arr = new int[n + 1]; // extra space for insertion

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Display original array
        System.out.println("Original Array:");
        displayArray(arr, n);

        // Insert an element
        System.out.print("Enter element to insert: ");
        int element = sc.nextInt();
        System.out.print("Enter position to insert (0 to " + n + "): ");
        int pos = sc.nextInt();

        // Shift elements to the right
        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = element;
        n++; // increase size

        System.out.println("Array after insertion:");
        displayArray(arr, n);

        // Delete an element
        System.out.print("Enter position to delete (0 to " + (n - 1) + "): ");
        int delPos = sc.nextInt();

        // Shift elements to the left
        for (int i = delPos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        n--; // decrease size

        System.out.println("Array after deletion:");
        displayArray(arr, n);
    }

    // Function to display array
    public static void displayArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
