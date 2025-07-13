package conditionalstatement;
import java.util.Scanner;

public class Areaofcircle{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius ");
        int r=sc.nextInt();
        System.out.println("Area of circle is "+Math.PI*Math.pow(r,2));
        sc.close();
    }
}