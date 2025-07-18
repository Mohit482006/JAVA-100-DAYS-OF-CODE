package conditionalstatement;

import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the string :");
        String str=scanner.next();

        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        scanner.close();
    }
}
