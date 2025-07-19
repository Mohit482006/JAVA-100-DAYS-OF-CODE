package function;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number");
        int num=scanner.nextInt();

        factorialNo(num);
        scanner.close();
    }
    static void factorialNo(int num){
        int fact=1;
        if(num==1&&num==0){
            System.out.println(num+"!"+"="+"1");
        }
        System.out.print(num+"!"+" = ");
        for(int i=1;i<=num;i++){
            fact*=i;
            System.out.print(i+" * ");
        }
        System.out.println(" = "+fact);
    }
}
