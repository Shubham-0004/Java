import java.util.Scanner;

public class isEven {

    public static void isEven(int n){
        boolean isEven=true;
        if (n%2!=0) {
            isEven=false;
        }
        System.out.println(isEven);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input
        System.out.print("Enter any number-->");
        int n=sc.nextInt();
        isEven(n);
        sc.close(); 
    }
}
