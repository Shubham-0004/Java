import java.util.Scanner;

public class binarytodecimal {
    public static int decimal(int binaryNumber){

        int decimal_number=0;
        int exp=0;
        boolean isValid=true; //flag to check for valid binary input

        while (binaryNumber>0) {
            int last_digit=binaryNumber%10;

            if (last_digit==0 || last_digit==1) {
                decimal_number=decimal_number+(last_digit*(int)(Math.pow(2,exp)));
                exp++;
                binaryNumber=binaryNumber/10;
            }else{
                isValid=false;
                break;
            }
        }

        if (!isValid) {
            return -1; //not a valid binary input
        }
        return decimal_number;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //taking the binary input
        System.out.print("Enter the binary number--->");
        int binaryNumber=sc.nextInt();

        //Calling the decimal function
        int decimalNumber=decimal(binaryNumber);

        if (decimalNumber==-1) {
            System.out.println("Invalid input ! Please enter a binary number only.");
        }
        else{
            System.out.print("The decimal conversion of "+binaryNumber+" is "+decimalNumber+".");
        }
        sc.close();
    }
}
