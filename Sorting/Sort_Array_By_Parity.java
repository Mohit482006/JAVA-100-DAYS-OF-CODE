class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length-1;
        int[] arr=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[j]=nums[i];
                j++;
            }else{
                arr[n]=nums[i];
                n--;
            }
        }
        return arr;
    }
}
