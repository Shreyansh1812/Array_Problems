public class Rotate_Matrix {
    public static void rotate_mat(int[][] matrix) {
    //     int n = matrix.length;
    //     int[][] temp = new int[n][n];
        
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < n; j++) {
    //             temp[j][(n - 1) - i] = matrix[i][j];
    //         }
    //     }
        
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < n; j++) {
    //             matrix[i][j] = temp[i][j];
    //         }
    //     }
    // }
    int n = matrix.length;
        
        // Perform a transpose of the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // Reverse each row to complete the 90-degree rotation
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }
    
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        rotate_mat(matrix);
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
