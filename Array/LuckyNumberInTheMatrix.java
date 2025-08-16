class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> minimumRow=new ArrayList<>();
        ArrayList<Integer> maximumCol=new ArrayList<>();
        ArrayList<Integer> result=new ArrayList<>();
        int row=matrix.length;
        int col=matrix[0].length;

        for(int i=0;i<row;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<col;j++){
                min=Math.min(matrix[i][j],min);
            }
            minimumRow.add(min);
        }
        for(int j=0;j<col;j++){
            int max=Integer.MIN_VALUE;
            for(int i=0;i<row;i++){
                max=Math.max(matrix[i][j],max);
            }
            maximumCol.add(max);
        }
        for(int i=0;i<minimumRow.size();i++){
            if(maximumCol.contains(minimumRow.get(i))){
                result.add(minimumRow.get(i));
            }
        }
        return result;
    }
}
