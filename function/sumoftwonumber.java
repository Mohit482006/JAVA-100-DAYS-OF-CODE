package function;

import java.util.Scanner;

public class sumoftwonumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the two numbers");
        int x=scanner.nextInt();
        int y=scanner.nextInt();

        System.out.println("Sum of two number is :"+sum(x,y));
        scanner.close();
    }
    static int sum(int a,int b){
        int sum=0;
        sum=a+b;
        return sum;
    }
}
