import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the order of diamond pattern--->");
        int n=sc.nextInt();

        //for the upper half part
        for (int i = 1; i <=n; i++) {

            // for the leading spaces
            for (int j = n-i; j >=1; j--) {
                System.out.print("   ");
            }

            // for the stars in middle
            for (int j = 1; j <=(2*i)-1; j++) {
                System.out.print(" * ");
            }

            // for the spaces at last
            for (int j = n-i; j >=1; j--) {
                System.out.print("   ");
            }
            System.out.println("\n");
        }


        // for the lower half part
        for (int i = n; i >=1; i--) {

            // for the leading spaces
            for (int j = n-i; j >=1; j--) {
                System.out.print("   ");
            }

            // for the stars in middle
            for (int j = 1; j <=(2*i)-1; j++) {
                System.out.print(" * ");
            }

            // for the spaces at last
            for (int j = n-i; j >=1; j--) {
                System.out.print("   ");
            }
            System.out.println("\n");
        }
        sc.close();
    }
}
