package function;

import java.util.Scanner;

public class evenorodd {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the number");
        int x=scanner.nextInt();

        checkevenorodd(x);   
        
        scanner.close();
    }
    static void checkevenorodd(int num){
       String even= (num%2==0)?"It is even":"It is odd";
       System.out.println(even);
    }
}
