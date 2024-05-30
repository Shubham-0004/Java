import java.util.Scanner;

public class invertednumberhalfpyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the order of the pattern--->");
        int order=sc.nextInt();
        for (int i = order; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+"  ");
            }
            System.out.println("\n");
        }
        sc.close();
    }
}
