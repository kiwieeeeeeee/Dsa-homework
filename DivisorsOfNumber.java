public class DivisorsOfNumber {
    public static void main(String[] args) {
        int n = 36; 
        System.out.println("Divisors of " + n + " are:");
        printDivisors(n);
    }
    public static void printDivisors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) { 
                System.out.println(i);
            }
        }
    }
}
