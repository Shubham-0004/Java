import java.util.Scanner;

public class checkprime {
    public static void checkprime(int n){
        boolean isPrime=true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i==0) {
                isPrime=false;
            }
        }

        System.out.println(isPrime);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Taking the input       
        System.out.print("Enter the number-->");
        int n=sc.nextInt();

        // Calling the function checkprime
        checkprime(n);

        sc.close();
    }
}
