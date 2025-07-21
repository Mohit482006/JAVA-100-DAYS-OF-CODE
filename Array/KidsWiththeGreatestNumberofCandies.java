package Array;

import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
    class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       List<Boolean> result=new ArrayList<>();
       int max=Maximum(candies);
        for(int i=0;i<candies.length;i++){
            int totalcandies=candies[i]+extraCandies;
            if(totalcandies>=max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
    public int Maximum(int[] candies){
        int max=0;
        for(int i=0;i<candies.length;i++){
            max=Math.max(candies[i],max);
        }
        return max;
    }
}
}
