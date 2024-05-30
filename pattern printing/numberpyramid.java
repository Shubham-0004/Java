import java.util.Scanner;

public class numberpyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the order for the Number Pyramid pattern-->");
        int n=sc.nextInt();

        for (int i = 1; i<=n; i++) {
            
            // for the leading spaces
            for (int j = (n-i); j >=1; j--) {
                System.out.print("  ");
            }

            // for the numbers
            for (int j = 1; j <=i; j++) {
                System.out.print(i+"  ");
            }
            System.out.println("\n");
        }
        sc.close();
    }
}
