package Array;

public class BuiltArrayfrompermutation {
    public static void main(String[] args) {
        
    }
    public int[] buildArray(int[] nums) {
        int[] ans=new int[nums.length];
        int r;
        for(int i=0;i<nums.length;i++){
            r=nums[i];
            ans[i]=nums[r];
        }
        return ans;
    }
}
