class SumofN {
    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 5; // Example input
        int result = findSum(n);
        System.out.println("The sum of the first " + n + " natural numbers is: " + result);
    }
}
