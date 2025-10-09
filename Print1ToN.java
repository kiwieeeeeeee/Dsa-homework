public class PrintNumbersRecursion {
    public static void main(String[] args) {
        int n = 10; 
        printNumbers(1, n);
    }
    public static void printNumbers(int current, int n) {
        if (current > n) {
            return; // Base case
        }
        System.out.println(current);
        printNumbers(current + 1, n); // Recursive call 
    }
}
