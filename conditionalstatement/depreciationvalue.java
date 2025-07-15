package conditionalstatement;

import java.util.Scanner;

public class depreciationvalue {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the original cost of the asset :");
        double cost=sc.nextDouble();

        System.out.println("Enter the salvage value:");
        double salvage=sc.nextDouble();

        System.out.println("Enter the useful life of the asset (in years) :");
        int usefullife=sc.nextInt();

        double annualdepreciation = (cost-salvage)/usefullife;

        System.out.printf("Annual depreciation : %2f\n",annualdepreciation);

        System.out.println("\n Year-wise depreciated value :");
        double bookvalue= cost;
        
        for(int year=1;year<=usefullife;year++){
            bookvalue-=annualdepreciation;
            System.out.printf("Year %d: %2f\n",year,bookvalue);
        }


        sc.close();
    }
}
