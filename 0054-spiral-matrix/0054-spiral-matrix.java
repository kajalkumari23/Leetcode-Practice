//class Solution {
//     public List<Integer> spiralOrder(int[][] matrix) {
//         int minr = 0;
//         int minc = 0;
//         int maxr = arr.length - 1;
//         int maxc = arr[0].length -1;
//         int tne = n*m;
//         int count = 0;
        
//         while(count<tne){
//             //top wall
//             for(int i=minr, j=maxc; j>=minc &&cnt<tne; j--){
//                 return matrix[i][j];
//                 count++;
//             }
//             minr ++;
//              //right wall 
//             for(int i=maxr, j=maxc; i>=minr &&cnt<tne; i--){
//                 return matrix[i][j];
//             }
//             maxc--;
//             //bottom wall
//             for(int i=maxr, j=minc; j<=maxc &&cnt<tne; j++){
//                 return matrix[i][j];
//             }
//             maxr--;
//             //left wall
//             for(int i=minr, j=minc; i<maxr &&cnt<tne; i++){
//                 return matrix[i][j];
//             }
//             minc ++;
//         }
//     }
// }
    
    class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        if(matrix.length == 0 || matrix[0].length == 0) return res;
        
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        
        while(true){
            for(int i = left; i <= right; i++) res.add(matrix[top][i]);
            top++;
            if(left > right || top > bottom) break;
            
            for(int i = top; i <= bottom; i++) res.add(matrix[i][right]);
            right--;
            if(left > right || top > bottom) break;
            
            for(int i = right; i >= left; i--) res.add(matrix[bottom][i]);
            bottom--;
            if(left > right || top > bottom) break;
            
            for(int i = bottom; i >= top; i--) res.add(matrix[i][left]);
            left++;
            if(left > right || top > bottom) break;
        }
        
        return res;
    }
    }
