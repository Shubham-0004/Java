import java.util.Scanner;

public class butterfly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the order for the butterfly pattern-->");
        int order=sc.nextInt();
        for (int i = 1; i <=order; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" * ");
            }
            for (int j = 1; j <= 2*(order-i); j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(" * ");
            }
            
            
            System.out.println("\n");
        }

        for (int i = order; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" * ");
            }
            for (int j = 1; j <= 2*(order-i); j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(" * ");
            }
            
            
            System.out.println("\n");
        }
        sc.close();
    }
}
