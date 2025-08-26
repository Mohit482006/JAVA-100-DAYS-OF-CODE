class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer=new ArrayList<>();
        int row=matrix.length;
        int col=matrix[0].length;

        int startrow=0;
        int startcol=0;
        int endrow=row-1;
        int endcol=col-1;

        while(startrow<=endrow&&startcol<=endcol){
            //top
            for(int i=startcol;i<=endcol;i++){
                answer.add(matrix[startrow][i]);
            }
            //right
            for(int i=startrow+1;i<=endrow;i++){
                answer.add(matrix[i][endcol]);
            }
            //bottom
            for(int i=endcol-1;i>=startcol;i--){
                if(startrow==endrow){
                    break;
                }
                answer.add(matrix[endrow][i]);
            }
            //left
            for(int i=endrow-1;i>=startrow+1;i--){
                if(startcol==endcol){
                    break;
                }
                answer.add(matrix[i][startrow]);
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
        return answer;
    }

}
