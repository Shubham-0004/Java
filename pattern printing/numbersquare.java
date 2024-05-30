import java.util.Scanner;

public class numbersquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the square-->");
        int side=sc.nextInt();
        System.out.println("You wish to print the numbersquare pattern of order "+side+".");
        for (int i = 1; i <=side; i++) {
            for (int j = 1; j <= side; j++) {
                System.out.print(j+"  ");
            }
            System.out.println("\n");
        }
        sc.close();
    }
}
