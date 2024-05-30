import java.util.Scanner;

public class binomialcoefficient {
    public static int factorial(int n){
        int product=1;
        for (int i = 1; i <=n; i++) {
            product=product*i;
        }
        return product;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Taking inputs
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        System.out.print("Enter r: ");
        int r=sc.nextInt();

        // Calling the function factorial
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);

        // Calculating the result
        int result=fact_n/((fact_r)*fact_nmr);

        //Displayed the result
        System.out.println("The binomial coefficient is :"+result);
        sc.close();
    }    
}
