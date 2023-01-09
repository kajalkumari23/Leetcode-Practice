class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0){
            return false;
        }
        int n = matrix.length; //row
        int m = matrix[0].length; // column
        
        int lo = 0; //low
        int hi = (n*m)-1; //high last imaginary index
        while(lo<=hi){
            int mid = (lo+(hi-lo)/2); //to avoid overflow
            if(matrix[mid / m][mid % m] == target){  // mid/m(column no) = row index|| mid% m (column no) = column index
                return true;
            }
            if(matrix[mid / m][mid % m] < target){
                lo = mid + 1;
            }
            else{
                hi = mid-1;
            }
        }
        return false;
    }
}