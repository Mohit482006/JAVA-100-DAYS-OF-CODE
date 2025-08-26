class Solution {
    public int[][] generateMatrix(int n) {
      int[][] matrix=new int[n][n];
      int startcol=0;
      int startrow=0;
      int endrow=n-1;
      int endcol=n-1;  

      int count=1;
      while(startrow<=endrow&&startcol<=endcol){

        for(int i=startcol;i<=endcol;i++){
            matrix[startrow][i]=count++;
        }
        startrow++;
        for(int i=startrow;i<=endrow;i++){
            matrix[i][endcol]=count++;
        }
        endcol--;
        
        if(startrow<=endrow){
            for(int i=endcol;i>=startcol;i--){
                matrix[endrow][i]=count++;
            }
            endrow--;
        }
        if(startcol<=endcol){
            for(int i=endrow;i>=startrow;i--){
               matrix[i][startcol]=count++;
            }
            startcol++;
        }
        
        // startcol++;
        // endrow--;
        // endcol--;
        
      }
      return matrix;
    }
}
