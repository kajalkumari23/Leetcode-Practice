class Solution {
    public void setZeroes(int[][] matrix) {
        int col0 = 1, rows= matrix.length, cols=matrix[0].length;
        for(int i=0; i<rows; i++){ //traversing in matrix
            if(matrix[i][0] == 0){  //check value in 0th column
                col0 = 0;
            }
            for(int j=1; j<cols; j++){ //iteration in first column
                if(matrix[i][j] == 0){
                    matrix[i][0] = matrix[0][j] =0;
                }
            }
        }
        //after traversing in 2d matrix // linearly traverse in 2d matrix
            for(int i = rows-1; i>=0; i--){
                for(int j=cols-1; j>=1; j--){
                    if(matrix[i][0] == 0 || matrix[0][j]==0){
                        matrix[i][j] = 0;
                    }
                }
                if(col0 == 0){
                matrix[i][0] = 0;
            }
            }
            
     }
}