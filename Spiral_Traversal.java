public class Spiral_Traversal {
    public static void spiralTraversal(int[][] matrix) {
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // Traverse from left to right along the top row
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++; // Move the top boundary down

            // Traverse from top to bottom along the right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--; // Move the right boundary left

            // Traverse from right to left along the bottom row (if still within bounds)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--; // Move the bottom boundary up
            }

            // Traverse from bottom to top along the left column (if still within bounds)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++; // Move the left boundary right
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        spiralTraversal(matrix);
    }
}
