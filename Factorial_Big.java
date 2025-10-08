  public class Main {
    public static int factorial(int n, int acc) {
        if (n<=0) { 
            return acc; 
        } else {
            return factorial(n-1, n*acc); 
        }
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(factorial(n, 1));
    }
}