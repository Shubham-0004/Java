import java.util.Scanner;

public class rhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the order for the rhombus pattern--->");
        int order=sc.nextInt();
        for (int i = 1; i <=order; i++) {
            for (int j = 1;j<=(2*order)-1; j++) {
                if (((i+j)>=(order+1)) && ((i+j)<=(2*order))) {
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
