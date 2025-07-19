package function;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number");
        int x=scanner.nextInt();
        int rem=0;

        
        System.out.println(reverse(x,rem));
        if(reverse(x, rem)==x){
            System.out.println("It is palindrome number");
        }else{
            System.out.println("It is not palindrome number");
        }
        scanner.close();
    }
    static int reverse(int num,int rem){
        int i=0;
        int newnum=0;
        // int q
        while(num>i){
            rem=num%10;
            newnum=newnum*10+rem;
            num=num/10;
            // return rem;
        }
        return newnum;
    }
}
