import java.util.Scanner;

public class factorial {

    public static int factorial(int n) {
        int result=1;
        // running a loop to calculate factorial
        for (int i = 1; i <=n; i++) {
            result=result*i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        //taking input
        System.out.print("Enter the number-->");
        int n=sc.nextInt();

        //Calling the function factorial
        int result=factorial(n);
        System.out.println("The factorial of "+n+" is "+result+".");
        sc.close();
    }
}
