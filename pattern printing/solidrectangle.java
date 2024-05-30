

import java.util.Scanner;

public class solidrectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // printing a solid rectangle
        System.out.print("Enter the number of columns of the rectangle-->");
        int columns=sc.nextInt();
        System.out.print("Enter the number of rows of the rectangle-->");
        int rows=sc.nextInt();
        System.out.println("You wish to print a solid rectangle of order "+columns+" and "+rows+" .");
        for (int i = 1; i <=columns; i++) {
            for (int j = 1; j <=rows; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
