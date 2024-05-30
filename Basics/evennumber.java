import java.util.Scanner;

public class evennumber {
    public static void main(String[] args) {
        // find even numbers between 9 and 100
        Scanner sc= new Scanner(System.in);
        System.out.print("All the even numbers between 9 and 100 is:");
        //  for (int i = 9; i <= 100; i++) {
        //     if (i%2==0) {
        //         System.out.print(i+" ");
        //     }
        //  }
       int num=10;
       while (num<=98) {
        if (num%2==0) {
            System.out.print(num+" ");
            num++;
        }
        else {
            num++;
        }
       }

        sc.close();
    }
}
