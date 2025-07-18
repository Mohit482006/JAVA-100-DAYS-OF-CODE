package conditionalstatement;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the string :");
        String str=scanner.next();
        
        if(ispalindrome(str).equals(str)){
            System.out.println("It is palindrome");

        }else{
            System.out.println(ispalindrome(str));
            System.out.println("It is not palindrome");
        }
        scanner.close();
    }
    public static String ispalindrome(String str){
        String str1 ="";
        for(int i=str.length()-1;i>=0;i--){
            str1+=str.charAt(i);
        }
        System.out.println(str1);
        return str1;
    }
}
