package conditionalstatement;

import java.util.Scanner;

public class commissionpercentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter total sales amount ");
        double totalsale=sc.nextInt();

        System.out.println("Enter commission earned: ");
        double commissionearned=sc.nextInt();

        if(totalsale==0){
            System.out.println("total sales cannot be zero");
        }else{
            double percentage=(commissionearned/totalsale)*100;
            System.out.println("Commission percentage: "+percentage+"%");
        }
        sc.close();
    }
}
