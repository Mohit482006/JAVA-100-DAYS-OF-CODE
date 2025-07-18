package conditionalstatement;

import java.util.Scanner;

public class HCFandLCM {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the first value");
        int x=scanner.nextInt();

        System.out.println("Enter the second value");
        int y=scanner.nextInt();

        int hcf=findhcf(x,y);

        int lcm=(x*y)/hcf;

        System.out.println("HCF of "+x+" and "+y+" is "+hcf);
        System.out.println("LCM of "+x+" and "+y+" is "+lcm);

        scanner.close();
    }
    public static int findhcf(int a,int b){
        while(b!=0){

            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    
}
