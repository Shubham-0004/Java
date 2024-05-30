import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //check whether a number is prime or not
        System.out.print("Enter any positive number-->");
        int number;
        number=sc.nextInt();
        int count=0;
        for (int i = 2; i < number; i++) {
           if (number%i==0) {
            count++;
           }
        }
        if (count==0) {
            System.out.println(number+" is a prime number.");
        }
        else{
            System.out.println(number +" is not a prime number.");
        }
        sc.close();
    }
}
