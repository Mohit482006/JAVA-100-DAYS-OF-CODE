class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int even=0;
        int odd=1;
        int n=nums.length;
        while(even<n&&odd<n){
            if(nums[even]%2==0){
                even+=2;
            }else if(nums[odd]%2!=0){
                odd+=2;
            }else{
                swap(nums,even,odd);
                even+=2;
                odd+=2;
            }
        }    
        return nums;
    }
    static void swap(int[] nums,int i,int m){
        int temp=nums[i];
        nums[i]=nums[m];
        nums[m]=temp;
    }
}
