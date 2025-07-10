import java.util.Scanner;

class largest{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the three number");
        int x=input.nextInt();
        int y=input.nextInt();
        int z=input.nextInt();
        if(x>y && x>z){
            System.out.println("X is largest");
        }else if(y>x && y>z){
            System.out.println("Y is largest");
        }else{
            System.out.println("Z is largest");
        }
    }
}