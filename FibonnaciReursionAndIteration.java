public class FibonacciExample {
    public static void main(String[] args) {
        int n = 10; // Print Fibonacci series till this number

        // Using iteration
        System.out.println("Fibonacci series up to " + n + " using iteration:");
        fibonacciIterative(n);

        // Using recursion
        System.out.println("Fibonacci series up to " + n + " using recursion:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        System.out.println();
    }

    // Iterative method
    public static void fibonacciIterative(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        System.out.println();
    }

    // Recursive method
    public static int fibonacciRecursive(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}
