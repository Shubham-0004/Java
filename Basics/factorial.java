import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for calculating factorial:");
        int n;
        n=sc.nextInt();
        int product=1;
        for (int i = n; i >=1; i--) {
            product=product*i;
        }
        System.out.println("The factorial of "+n+" is "+product);
        sc.close();
    }
}
