import java.util.Scanner;

public class decimaltobinary {
    public static int binary(int decimalNumber){
        int binaryNumber=0;
        int po=0;
        while (decimalNumber>0) {
            int rem=decimalNumber%2;
            binaryNumber=binaryNumber+(rem*(int)Math.pow(10, po));
            po++;
            decimalNumber=decimalNumber/2;
        }
        return binaryNumber;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // taking the input decimal number
        System.out.print("Enter any decimal number--->");
        int decimalNumber=sc.nextInt();

        int binary_number=binary(decimalNumber);
        System.out.println("The binary conversion of "+decimalNumber+" is "+binary_number);
        sc.close();
    }
}
