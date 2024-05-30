import java.util.Scanner;

public class positiveornegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number--->");
        int number;
        number=sc.nextInt();
        if (number>=0) {
            System.out.println(number+" is positive integer.");
        }
        else{
            System.out.println(number+" is negative integer.");
        }
        sc.close();
    }
}
