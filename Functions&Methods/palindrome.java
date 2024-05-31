import java.util.Scanner;

public class palindrome {
    public static void palindrome(int n){
        int originalNumber=n;
        // counting the number of digits
        int count=0;
        int temp=n;
        while (temp>0) {
            temp=temp/10;
            count++;
        }

        // Reversed Number
        int reverseNumber=0;
        temp=n;
        while (temp>0) {
            int rem=temp%10;
            reverseNumber=reverseNumber+rem*(int)Math.pow(10, (count-1));
            count--;
            temp=temp/10;
        }
        if (originalNumber==reverseNumber) {
            System.out.print(originalNumber + " is Palindrome");
        }else{
            System.out.println(originalNumber+" is not Palindrome");
        }

        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input
        System.out.print("Enter any number to check if it is a palindrome-->");
        int n=sc.nextInt();

        palindrome(n);
        sc.close();
    }
}
