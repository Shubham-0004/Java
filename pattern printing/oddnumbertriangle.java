import java.util.Scanner;

public class oddnumbertriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows for the odd number triangle pattern-->");
        int rows;
        rows=sc.nextInt();
        System.out.println("You wish to print an odd number triangle pattern of order "+rows+".");
        for (int i = 1; i <=rows; i++) {
            for (int j = 1; j <=2*i; j++) {
                if (j%2!=0) {
                    System.out.print(j+"  ");
                }
            }
            System.out.println("\n");
        }
        sc.close();
    }
}
