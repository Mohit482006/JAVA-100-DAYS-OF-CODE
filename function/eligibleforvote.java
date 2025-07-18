package function;

import java.util.Scanner;

public class eligibleforvote {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the age");
        int age=scanner.nextInt();

        eligble(age);
        scanner.close();
    }
    static void eligble(int age){
        String x=(age>=18)?"He/her is eligible":"He/her is not eligible";
        System.out.println(x);
    }
}
