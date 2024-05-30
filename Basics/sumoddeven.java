import java.util.Scanner;
public class sumoddeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("The program will calculate the sum of odd and even integers separately.");
        int number;
        int choice;
        int evenSum=0;
        int oddSum=0;
        do {
            System.out.print("Enter the number--->");
            number=sc.nextInt();
            if (number%2==0) {
                evenSum=evenSum+number;
            }else{
                oddSum=oddSum+number;
            }

            System.out.print("Do you want to continue ? for (Yes) press 1 and for (No) press 0--->");
            choice=sc.nextInt();

        } while (choice==1);

        System.out.println("Even Sum = "+evenSum);
        System.out.print("Odd Sum = "+oddSum);
        sc.close();
        
    }
}
