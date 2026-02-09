class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        // int ans=0;
        for(int i=0;i<=nums.length;i++){
            count=findgreater(nums,i);
            if(count==i){
                return count;
            }
        }
        return -1;
    }
    static int findgreater(int[] nums,int x){
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=x){
                ans++;
            }
        }
        return ans;
    }
}
