public class FactorialExample {
    public static void main(String[] args) {
        int num = 5; // Change this number to find factorial of another number

        // Factorial using iteration
        int iterativeResult = factorialIterative(num);
        System.out.println("Factorial of " + num + " using iteration: " + iterativeResult);

        // Factorial using recursion
        int recursiveResult = factorialRecursive(num);
        System.out.println("Factorial of " + num + " using recursion: " + recursiveResult);
    }

    // Iterative method
    public static int factorialIterative(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Recursive method
    public static int factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        } else {
            return n * factorialRecursive(n - 1); // Recursive call
        }
    }
}
