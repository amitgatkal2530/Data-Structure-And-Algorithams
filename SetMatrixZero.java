class SetMatrixZero{
     public void set(int[][] matrix) { 
        int n = matrix.length;
        int m = matrix[0].length;
        int col = -1; 
        
        // Mark rows and columns to be zeroed out
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    if (j != 0) {
                        matrix[0][j] = 0;
                    } else {
                        col = 0; // Set col flag if j is 0
                    }
                }
            }
        }
        
        // Set zeros based on marked rows and columns
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        // Set zeros for first row if necessary
        if (matrix[0][0] == 0) {
            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }
        
        // Set zeros for first column if necessary
        if (col == 0) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}