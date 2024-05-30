import java.util.Scanner;

public class solidrhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the order for the solid rhombus pattern--->");
        int n=sc.nextInt();
        // for (int i = 1; i <=n; i++) {
        //     for (int j = 1; j <=(2*n)-1; j++) {
        //         if ((i+j>n) && (i+j<=(2*n))) {
        //             System.out.print(" * ");
        //         }else{
        //             System.out.print("   ");
        //         }
        //     }
        //     System.out.println("\n");
        // }

        for (int i = 1; i <=n; i++) {
            for (int j = (n-1); j >=1; j--) {
                System.out.print("   ");
            }

            for (int j = 1; j <=n; j++) {
                System.out.print(" * ");
            }
            System.out.println("\n");
        }
        sc.close();
    }
}
