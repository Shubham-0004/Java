import java.util.Scanner;

public class invertedstartriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows-->");
        int rows=sc.nextInt();
        System.out.println("You wish to print a inverted star triangle of order "+rows+".");
        for (int i = 1; i <=rows; i++) {
            for (int j = rows; j >=i; j--) {
                System.out.print("  *  ");
            }
            System.out.println("\n");
        }
        sc.close();
    }
}
