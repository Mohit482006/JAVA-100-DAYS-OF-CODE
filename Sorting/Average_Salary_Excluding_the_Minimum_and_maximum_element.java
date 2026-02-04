class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double sum=0;
        double avg=0;
        int n=salary.length;
        for(int i=1;i<n-1;i++){
            sum=sum+salary[i];
        }
        int k=n-2;
        avg=sum/k;
        return avg;
    }
}
