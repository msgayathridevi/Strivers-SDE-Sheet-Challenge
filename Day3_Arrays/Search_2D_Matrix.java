class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length, m=matrix[0].length,i=0,j=m-1;
        while(i<n && j>=0){
            if(matrix[i][j]==target){
                return true;
            }
            else if(matrix[i][j]>target)
                j--;
            else i++;
        }
        return false;
        
    }
}