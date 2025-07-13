package conditionalstatement;

import java.util.Scanner;

public class fibonacciseries {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the number of terms");
        int n=input.nextInt();
        
        int first=0,second=1;

        System.out.println("Fibonacci series upto "+ n +"terms :");

        for(int i=1;i<=n;i++){
            System.out.println(first+" ");

            int next=first+second;
            first=second;
            second=next;
        }
        input.close();
    }
}
