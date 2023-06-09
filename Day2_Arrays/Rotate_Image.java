class Solution {
    public void swap(int [][]matrix, int i,int j){
        int t = matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=t;
    }
    public void rotate(int[][] matrix) {
        
        // transpose
        for(int i=0;i<matrix.length-1;i++){
            for(int j=i+1;j<matrix.length;j++){
                swap(matrix,i,j);
            }
        }

        // reverse each row mat[i]
        for(int i=0;i<matrix.length;i++){
            // reverse
            int p1=0,p2=matrix.length-1;
            while(p1<p2){
                swap(matrix,p1,p2);
                p1++;p2--;
            }
        }

    }
}