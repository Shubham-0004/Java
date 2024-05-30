import java.util.Scanner;

public class numberalphabettriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows for the number & alphabet triangle pattern--->");
        int rows=sc.nextInt();
        System.out.println("You wish to print a number & alphabet traingle of order "+rows+".");
        for (int i = 1; i <=rows; i++) {
            char ch='A';
            for (int j = 1; j <=i; j++) {
                if (i%2!=0) {
                    System.out.print(j+"  ");
                }
                else if (i%2==0) {
                    System.out.print(ch+"  ");
                    ch++;
                }
            }
            System.out.println("\n");
        }
        sc.close();
    }
}
