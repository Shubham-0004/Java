
import java.util.Scanner;
public class hollowrectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         // printing a hollow rectangle
         System.out.print("Enter the number of columns of the rectangle-->");
         int columns=sc.nextInt();
         System.out.print("Enter the number of rows of the rectangle-->");
         int rows=sc.nextInt();
         System.out.println("You wish to print a hollow rectangle of order "+columns+" x "+rows+" .");
         for (int i = 1; i <=rows; i++) {
             for (int j = 1; j <=columns; j++) {
                if (i==1 || j==1 ||i==rows || j==columns) {
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
                }
            System.out.println("\n");
            }

        sc.close();
    }
}
