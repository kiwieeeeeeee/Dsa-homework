public class SimpleMatrixOperations {
    public static void main(String[] args) {
        // 2x2 matrices
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{5, 6}, {7, 8}};

        int[][] sum = new int[2][2];
        int[][] product = new int[2][2];

        // Addition
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Multiplication
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                product[i][j] = matrix1[i][0] * matrix2[0][j] + matrix1[i][1] * matrix2[1][j];
            }
        }

        // Display results
        System.out.println("Sum of matrices:");
        printMatrix(sum);

        System.out.println("Product of matrices:");
        printMatrix(product);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
