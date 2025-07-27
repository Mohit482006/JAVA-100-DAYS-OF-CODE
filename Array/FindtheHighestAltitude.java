package Array;

public class FindtheHighestAltitude {
    class Solution {
    public int largestAltitude(int[] gain) {
        int[] newgain=new int[gain.length+1];
        for(int i=0;i<gain.length;i++){
            newgain[i+1]=gain[i];
        }
        newgain[0]=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        // System.out.println(max);
        for(int i=0;i<newgain.length;i++){
           sum=sum+newgain[i];
           newgain[i]=sum;
        }
        for(int i=0;i<newgain.length;i++){
            if(max<=newgain[i]){
                max=newgain[i];
            }
        }
        return max;
    }
}
}
