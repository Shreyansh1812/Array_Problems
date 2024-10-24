public class Matrix_Zero {
    public static void set_Matrix(int [][] matrix,int m,int n) 
    {
         boolean [] rows = new boolean[m];
         boolean [] columns = new boolean[n];
         for(int i=0;i<n;i++)
         {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    rows[i]=true;
                    columns[j]=true;
                }
            }
         }
         // For Setting the Rows to Be Zero
         for(int i=0;i<n;i++)
         {
            if(rows[i])
            {
                for(int j=0;j<m;j++)
                {
                    matrix[i][j]=0;
                }
            }
         }
         // Setting Columns to be Zero
         for(int j=0;j<m;j++)
         {
            if(columns[j])
            {
                for(int i=0;i<n;i++)
                {
                    matrix[i][j]=0;
                }
            }
         }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 0}
        };
        int n = matrix.length;
        int m = matrix[0].length;

        set_Matrix(matrix, n, m);

        // Print the modified matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
