package conditionalstatement;

import java.util.Scanner;

public class NcrandNpr {
    public static void main(String[] args) throws ArithmeticException {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number");
        int number=scanner.nextInt();
        
        System.out.println("Enter the value of base");
        int base=scanner.nextInt();

        int r=number-base;

        long fact=factorial(number);
        long b=factorial(base);
        long x=factorial(r);


        System.out.println("permutation of "+ number +" and "+ base +" is:"+nPr(fact, x));
        System.out.println("Combination of "+ number +" and "+ base +" is:"+nCr(fact, x,b));

        scanner.close();
    }
    public static long factorial(int number){
        long fact=1;
        for(int i=2;i<=number;i++){
            fact*=i;
        }
        System.out.println(fact);
        return fact;
    }  
    public static long nCr(long fact,long x,long b){
        
        long y=(fact)/((x)*(b));
        return y;
    }  
    public static long nPr(long fact,long x){
        
        long z=fact/x;

        return z;
    }  
}
