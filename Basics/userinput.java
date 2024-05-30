import java.util.Scanner;
public class userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number:");
        int first_number;
        first_number=sc.nextInt();

        System.out.println("Enter 2nd number:");
        int second_number;
        second_number=sc.nextInt();

        System.out.println("You have entered two numbers as: "+first_number+" & "+second_number);

        int result;
        result=first_number+second_number;
        System.out.println("The sum of given two numbers is : "+result);
        sc.close();
    }
}
