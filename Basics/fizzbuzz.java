import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        // Fizz Buzz Problem
        // if n is only divisible by 3 print Fizz
        // if n is divisble by 5 print Buzz
        // if n is divisble by 15 print FizzBuzz

        //Taking input
        System.out.print("Enter the number here --->");
        int n=sc.nextInt();

        if (n%3==0 && n%5!=0) {
            System.out.println("Fizz");
        }else if (n%5==0 && n%3!=0){
            System.out.println("Buzz");
        }else if (n%15==0){
            System.out.println("FizzBuzz");
        }

        sc.close();
    }
}
