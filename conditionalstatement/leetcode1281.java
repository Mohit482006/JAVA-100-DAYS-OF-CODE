package conditionalstatement;


public class leetcode1281 {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int product=1;
        int i=1;
        while(i<=n){
            int rem=n%10;
            n=n/10;
            sum=sum+rem;
            product=product*rem;

        }
        int result=product-sum;
        return result;
    }
}
