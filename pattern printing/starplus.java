import java.util.Scanner;

public class starplus {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the odd number of rows for the star plus pattern--->");
        int rows=sc.nextInt();
        int s=(rows/2)+1;
        if (rows%2!=0) {
            for (int i = 1; i <=rows; i++) {
                for (int j = 1; j <=rows; j++) {
                    if (i==s || j==s || (i==s && j==s)) {
                        System.out.print("  *  ");
                    }
                    else{
                        System.out.print("     ");
                    }
                }
                System.out.println("\n");
            }
        }
        else{
            System.out.print("Please enter any odd number only for this pattern.");
        }
        sc.close();
    }
}
