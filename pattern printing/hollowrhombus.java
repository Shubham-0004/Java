import java.util.Scanner;

public class hollowrhombus {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the pattern for the hollow rhombus pattern--->");
        int n=sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = (n-i); j >=1; j--) {
                System.out.print("   ");
            }
            for (int j = 1; j <=n; j++) {
                if (i==1 || j==n || j==1 ||i==n) {
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
