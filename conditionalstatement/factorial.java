package conditionalstatement;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number");
        double n=scanner.nextDouble();

        double fact=1;
        for(int i=2;i<=n;i++){
            fact*=i;
        }
        System.out.println("factprial is "+fact);

        scanner.close();
    }
}
