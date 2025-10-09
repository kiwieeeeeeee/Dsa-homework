public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3; // Number of disks
        char source = 'A';
        char auxiliary = 'B';
        char destination = 'C';

        System.out.println("Moves to solve Tower of Hanoi for " + n + " disks:");
        solveTowerOfHanoi(n, source, destination, auxiliary);
    }

    // Recursive method to solve Tower of Hanoi
    public static void solveTowerOfHanoi(int n, char source, char destination, char auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Move n-1 disks from source to auxiliary
        solveTowerOfHanoi(n - 1, source, auxiliary, destination);

        // Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Move n-1 disks from auxiliary to destination
        solveTowerOfHanoi(n - 1, auxiliary, destination, source);
    }
}
