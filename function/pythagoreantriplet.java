package function;

import java.util.Scanner;

public class pythagoreantriplet {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the two number");
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        int z=scanner.nextInt();

        pythagorean(x,y,z);
        scanner.close();
    }   
    static void pythagorean(int x,int y,int z){
        double a=Math.pow(x, 2)+Math.pow(y, 2);
        double b=Math.pow(z, 2);

        if(a==b){
            System.out.println("It is pythagorean triplets");
        }else{
            System.out.println("It is not pythagorean triplets");
        }
    }
}
