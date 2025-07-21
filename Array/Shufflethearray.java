package Array;

class Shufflethearray{
    public int[] shuffle(int[] nums, int n) {
       int size=nums.length/2;
       int[] arr=new int[nums.length];
       int k=0;
       int i=0;
       int j=size;
       while(i<size&&j<nums.length){
            arr[k++]=nums[i++];
            arr[k++]=nums[j++];
       }
       return arr;
   }
}
