import java.util.Scanner;

public class prime1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //print all the prime numbers between 2 and 100
        System.out.print("All the prime numbers which lies between 2 and 100 is:");
        for (int i = 2; i < 100; i++) {
            int count=0;
            for (int j = 2; j < i; j++) {
                if (i%j==0) {
                    count++;
                }
            }
            if (count==0 && i!=1) {
                System.out.print(i+" ");
            }
        }
        
        sc.close();
    }
}
