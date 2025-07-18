package function;

import java.util.Scanner;

public class productoftwonumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the two numbers");
        int x=scanner.nextInt();
        int y=scanner.nextInt();

        System.out.println("Product of two number is :"+product(x,y));
        scanner.close();
    }
    static int product(int a,int b){
        int pro=1;
        pro=a*b;
        return pro;
    }
}
