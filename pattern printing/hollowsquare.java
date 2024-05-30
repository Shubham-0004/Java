import java.util.Scanner;

public class hollowsquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the side of the square-->");
        int side=sc.nextInt();
        System.out.println("You wish to print the hollow square pattern of the order "+side+".");
        for (int i = 1; i <=side; i++) {
            for (int j =1; j <=side; j++) {
                if (i==1||j==1||i==side||j==side) {
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
