import java.util.Scanner;
public class addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hey There ! Be Ready with your numbers to get the adddition done...");
        System.out.println("Now , Just enter your first number:");
        int num1;
        num1=sc.nextInt();
        System.out.println("Now,Enter the second number :");
        int num2;
        num2=sc.nextInt();
        System.out.println("You have entered two numbers as:"+num1+" & "+num2);
        int result;
        result=num1+num2;
        System.out.println("And Here the addition has been done !");
        System.out.println("The sum of given two numbers is : "+result);

        sc.close();
    }
}
