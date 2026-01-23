class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int distinct=1;
        int max=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]!=nums[i+1]){
                distinct++;
                if(distinct==3) return nums[i];
            }   
        } 
        return max;
    }   
    // static void sort(int[] arr){
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[i]>arr[j]){
    //                 swap(arr,i,j);
    //             }
    //         }
    //     }
    // }
    // static void swap(int[] arr,int i,int j){
    //     int temp=arr[i];
    //     arr[i]=arr[j];
    //     arr[j]=temp;
    // }
}
