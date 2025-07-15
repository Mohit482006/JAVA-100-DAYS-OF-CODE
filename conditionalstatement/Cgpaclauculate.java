package conditionalstatement;

import java.util.Scanner;

public class Cgpaclauculate {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the total number of subjects :");
        int totalno=scanner.nextInt();

        System.out.println("Enter the gradepoints");
        int sum=0;
        for(int i=1;i<=totalno;i++){
            int gradepoints=scanner.nextInt();
            System.out.println("Subject "+i+":"+" "+ gradepoints);
            sum+=gradepoints;
        }
        System.out.println("Sum of gradepoints is :"+sum);

        double cgpa= sum/totalno;

        System.out.println("It is CGPA :"+cgpa);

        scanner.close();

    }    
}
