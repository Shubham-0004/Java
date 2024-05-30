import java.util.Scanner;

public class floydstriangle1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the order of the pattern--->");
        int order=sc.nextInt();
        int count=1;
        for (int i = 1; i <=order; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(count);
                count++;
            }
            System.out.println("\n");
        }
        sc.close();
    }
}
