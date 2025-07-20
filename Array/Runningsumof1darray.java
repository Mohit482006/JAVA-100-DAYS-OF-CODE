package Array;

public class Runningsumof1darray {
    class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningsum=new int[nums.length];
        runningsum[0]=0;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                runningsum[i]=runningsum[i]+nums[i];
                continue;
            }
            runningsum[i]=runningsum[i-1]+nums[i];
        }
        return runningsum;
    }
}
}
