import java.util.Scanner;

public class palindromicpattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        //taking input for the order of pattern
        System.out.print("Enter the order for the Palindromic Pattern--->");
        int n=sc.nextInt();

        for (int i = 1; i <=n; i++) {
            
          //for the leading spaces
            for (int j = (n-i); j >=1; j--) {
                System.out.print("   ");
            }

            //for the numbers
            for (int j = i; j >=1; j--) {
                System.out.print(j+"  ");
            }

            //for the ending spaces
            for (int j = 2; j <=i; j++) {
                System.out.print(j+"  ");
            }
            System.out.println("\n");
        }


        sc.close();
    }
}
