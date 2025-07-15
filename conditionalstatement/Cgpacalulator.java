package conditionalstatement;

public class Cgpacalculator{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the total number of subjects :");
        int totalno=scanner.nextInt();

        for(int i=1;i<=totalno;i++){
            int gradepoints=scanner.nextInt();
            System.out.println("Subject :"+ i +" "+ gradepoints);
        }
        // int sum=0;
        // for(int i=0;i<=totalno;i++){}
    }
}