import java.util.Scanner;

public class hollowrectangle1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows--->");
        int rows=sc.nextInt();
        System.out.print("Enter the number of columns--->");
        int columns=sc.nextInt();
        System.out.println("You wish to print a hollow rectangle of order "+rows+" X "+columns);
        for (int i = 1; i <=rows; i++) {
            for (int j = 1; j <=columns; j++) {
                if (i==1 || j==1 || i==rows || j==columns) {
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
