class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] nums=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            nums[i]=arr[i];
        }
        Arrays.sort(arr);
        Map<Integer,Integer> ranks=new HashMap<>();
        for(int i:arr){
            ranks.putIfAbsent(i,ranks.size()+1);
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=ranks.get(nums[i]);
        }
        return nums;
    }
}
