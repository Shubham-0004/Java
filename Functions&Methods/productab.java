import java.util.Scanner;
public class productab {

    public static double product(double a,double b) {
        double result = a*b;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Taking two numbers as input
        System.out.print("Enter a: ");
        double a=sc.nextDouble();
        System.out.print("Enter b: ");
        double b=sc.nextDouble();

        // display result
        double result = product(a,b);
        System.out.println("The value of "+a+" x "+b+" is "+result+".");
        sc.close();
    }
}
