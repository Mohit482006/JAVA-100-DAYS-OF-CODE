package conditionalstatement;

import java.util.Scanner;

public class AreaofIsosceles {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of base of triangle");
        int base=input.nextInt();

        System.out.println("Enter the value of height of triangle");
        int height=input.nextInt();

        System.out.println("Area of isosceles triamgle is "+(0.5*base*(Math.sqrt(Math.pow(height, 2)-((Math.pow(base, 2)/4))))));
        input.close();

    }
}
