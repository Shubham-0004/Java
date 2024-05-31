import java.util.Scanner;

public class averageofthree {
    public static double average(double num1,double num2,double num3){
        double  result=(num1 + num2 + num3)/3;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input of three numbers
        System.out.print("Enter a: --->");
        double num1=sc.nextDouble();
        System.out.print("Enter b: --->");
        double num2=sc.nextDouble();
        System.out.print("Enter c: --->");
        double num3=sc.nextDouble();

        double result=average(num1,num2,num3);
        System.out.println("The average of "+num1+","+num2+","+num3+" is "+result);

        sc.close();
    }
}
