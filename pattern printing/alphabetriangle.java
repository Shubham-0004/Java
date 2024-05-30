import java.util.Scanner;

public class alphabetriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows in the alphabet triangle pattern-->");
        int rows;
        rows=sc.nextInt();
        System.out.println("You wish to print an alphabet triangle pattern of order "+rows+".");
        for (int i = 1; i <=rows; i++) {
            char ch='A';
            for (int j = 1; j <=i; j++) {
                System.out.print(ch+"  ");
                ch++;
            }
            System.out.println("\n");
        }
        sc.close();
    }
}
