class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
       Arrays.sort(arr);

       List<List<Integer>> result=new ArrayList<>();
       int mindiff= Integer.MAX_VALUE;

       for(int i=1;i<arr.length;i++){
            mindiff=Math.min(mindiff,arr[i]-arr[i-1]);
       }
    //    System.out.print(mindiff);
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==mindiff){
                result.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
       return result;
    }
}
