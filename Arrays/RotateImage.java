class RotateImage {
    public void rotate(int[][] matrix) {
        
        // transpose
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int tmp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = tmp;
            }
        }
        
        // now swap till middle
        for(int i = 0; i < n;i++){
            for(int j = 0 ; j < n/2 ; j++){
                int temp = matrix[i][j];
                 matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1]= temp;
            }
        }
    }
}