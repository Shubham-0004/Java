import java.util.Scanner;

public class factorial1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number--->");
        int number=sc.nextInt();
        int factorial=1;
        for (int i = number; i >=1; i--) {
            factorial=factorial*i;
        }
        System.out.println("The value of "+number+"! is:"+factorial);
        sc.close();
    }
}
