package function;

import java.util.Scanner;

public class primeornot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number");
        int x=scanner.nextInt();

        if(checkprimeNo(x)){
            System.out.println("Number is prime");

        }else{
            System.out.println("Number is not prime");
        }
        scanner.close();
    }
    static boolean checkprimeNo(int x){
        if(x<2){
            return false;
        }
        for(int i=2;i<=x;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
}
