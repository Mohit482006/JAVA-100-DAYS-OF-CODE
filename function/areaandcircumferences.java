package function;

import java.util.Scanner;

public class areaandcircumferences {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the radius of circle");
        float r=scanner.nextFloat();

        area(r);
        circumferences(r);

        scanner.close();
    }
    static void area(float r){
        double area=Math.PI*Math.pow(r, 2);
        System.out.println("Area of circle is :"+area);
    }
    static void circumferences(float r){
        double circumferences=2*Math.PI*r;
        System.out.println("circumfernces of circle is:"+circumferences);
    }
}
