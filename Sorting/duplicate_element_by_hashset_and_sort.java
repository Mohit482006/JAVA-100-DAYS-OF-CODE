class Solution {
    public boolean containsDuplicate(int[] nums) {
       boolean ans=false;
    //    HashSet<Integer> set=new HashSet<>();
    //    for(int i=0;i<nums.length;i++){
    //         if(set.contains(nums[i])){
    //             ans=true;
    //             break;
    //         }
    //         set.add(nums[i]);
    //    }      
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                ans=true;
            }
        }
       return ans;
    }
}
