class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] res=new int[r][c];
        int row=mat.length;
        int col=mat[0].length;
        if(row*col!=r*c){
            return mat;
        }

        int[] arr=new int[row*col];
        int index=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[index++]=mat[i][j];
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                res[i][j]=arr[i*c+j];
            }
        }
        return res;
    }
}
