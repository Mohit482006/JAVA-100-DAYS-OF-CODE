package conditionalstatement;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the Armstrong number :");
        int num=scanner.nextInt();
        int sum=0;
        if(armstrongnumber(num,sum)==num){
            System.out.println("Number is armstrong");
        }else{
            System.out.println("Number is not armtrong");
        }
        scanner.close();
    }
    public static int armstrongnumber(int num,int sum){
        int i=1;
        sum=0;
        while(num>=i){
            int rem=num%10;
            num=num/10;
            double cube=Math.pow(rem,3);
            sum+=cube;
        }
        return sum;
    }
}
