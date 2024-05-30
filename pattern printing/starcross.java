import java.util.Scanner;

public class starcross {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any odd number to display a star cross pattern--->");
        int rows=sc.nextInt();
        if (rows%2!=0) {
            for (int i = 1; i <=rows; i++) {
                for (int j = 1; j <=rows; j++) {
                    if (i==j || (i+j==6)) {
                        System.out.print(" * ");   
                    }
                    else{
                        System.out.print("   ");
                    }
                }
                System.out.println("\n");
            }
        }
        else{
            System.out.println("Please enter any odd number only to see this pattern!");
        }
        sc.close();
    }    
}
