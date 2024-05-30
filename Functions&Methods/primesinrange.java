import java.util.Scanner;

public class primesinrange {
    public static boolean checkprime(int n){

        if (n<=1) {
           return false; 
        }
        if (n==2) {
            return true;
        }
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Taking input
        System.out.print("Enter the range for checking the prime numbers--->");
        int range=sc.nextInt();

        for (int i = 2; i <=range; i++) {
            if(checkprime(i)){
                System.out.print(i +"  ");
            }
            
        }
        sc.close();
    }
}
