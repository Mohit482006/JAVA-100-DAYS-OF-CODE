package Array;

public class Concatenationofarray {
    public int[] getConcatenation(int[] nums) {
        // int[] arr=new int[nums.length];
        int[] ans=new int[2*nums.length];
        // for(int i=0;i<nums.length;i++){
        //     arr[i]=nums[i];
        // }
        // return arr;
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
            
        }
        return ans;

    }
}
