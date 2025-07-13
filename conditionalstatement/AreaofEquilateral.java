package conditionalstatement;
import java.util.Scanner;
public class AreaofEquilateral {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the value of lenght of triangle ");
        int length=input.nextInt();

        System.out.println("Area of Equilateral triangle is "+(Math.sqrt(3)/4)*Math.pow(length, 2));
        input.close();
    }
}
