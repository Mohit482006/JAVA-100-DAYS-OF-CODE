package Array;

public class HowManyNumbersAreSmallerThantheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] answer=new int[nums.length];
        // int count=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            answer[i]=count;
        }
        return answer;
    }
}
