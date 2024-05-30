import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number see the multiplication table--->");
        int number;
        number=sc.nextInt();
        System.out.println("The multiplication table of "+number+" is displayed below:");
        for (int i = 1; i <=10; i++) {
            System.out.println(number +" X "+ i +" = " +(number*i));
        }
        sc.close();
    }
}
