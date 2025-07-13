package conditionalstatement;

import java.util.Scanner;

public class Enter0printsumofallintegers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Enter the number");
        int n=scanner.nextInt();

        System.out.println("Enter the zero");
        int x=scanner.nextInt();

        int sum=0;
        for(int i=1;i<=n;i++){
            if(x==0){
                sum+=i;
            }else{
                System.out.println("Please enter the zero");
                break;
            }
        }
        System.out.println("sum is "+sum);
        scanner.close();
    }
    
}
