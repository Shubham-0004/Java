import java.util.Scanner;

public class prime2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //print any two prime numbers between to user inout numbers
        System.out.print("Enter the range to find the prime numbers between them: ___ to ___.");
        int a;
        a=sc.nextInt();
        int b;
        b=sc.nextInt();
        System.out.print("All the prime numbers between "+a+" and "+b+" is :");
        for (int i = a; i < b; i++) {
            int count=0;
            for (int j = 2; j < i; j++) {
                if (i%j==0) {
                    count++;
                }
            }
            if (count==0 && i!=1) {
                System.out.print(i +" ");
            }
        }
        sc.close();
    }
}
