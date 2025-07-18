package function;

import java.util.Scanner;

public class maxandmin {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number: ");
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        int z=scanner.nextInt();

        maximum(x,y,z);
        minimum(x, y, z);

        scanner.close();
    }
    static void maximum(int a,int b,int c){
        if(a>=b&&a>=c){
            System.out.println("Maximum is:"+a);
        }else if(b>=a&&b>=c){
            System.out.println("Maximum is :"+b);
        }else{
            System.out.println("Maximum is :"+c);
        }
    }
    static void minimum(int a,int b,int c){
        if(a<b&&a<c){
            System.out.println("Minimum is :"+a);
        }else if(b<a&&b<c){
            System.out.println("Minimum is :"+b);
        }else{
            System.out.println("Minimum is :"+c);
        }
    }
}
