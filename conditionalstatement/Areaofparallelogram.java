package conditionalstatement;

import java.util.Scanner;

public class Areaofparallelogram {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the value of base of triangle");
    int base=input.nextInt();

    System.out.println("Enter the value of height of triangle");
    int height=input.nextInt();

    System.out.println("Area of Parallelogram: "+(base*height));
    input.close();
    }
}
