package conditionalstatement;

import java.util.Scanner;

public class volumeofcone {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the radius ");
        int radius=input.nextInt();

        System.out.println("Enter the height");
        int height=input.nextInt();

        System.out.println("Volume of cone is "+((0.333)*Math.PI*Math.pow(radius, 2)*height));
        input.close();
    }
}
