import java.util.Scanner;

public class numbertriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows in the number triangle pattern-->");
        int rows;
        rows=sc.nextInt();
        System.out.println("You wish to print a number triangle pattern of order "+rows+".");
        for (int i = 1; i <=rows; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+"  ");
            }
            System.out.println("\n");
        }
        sc.close();
    }
}
