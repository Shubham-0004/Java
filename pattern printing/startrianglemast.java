import java.util.Scanner;

public class startrianglemast {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the order of the star triangle MAST pattern--->");
        int order=sc.nextInt();
        for (int i = 1; i <=order; i++) {
            for (int j = 1; j <=order; j++) {
                if ((i+j)>=(order+1)) {
                    System.out.print("  *  ");
                }
                else{
                    System.out.print("     ");
                }
            }
            System.out.println("\n");
        }
        sc.close(); 
    }
}
