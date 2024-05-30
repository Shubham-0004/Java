import java.util.Scanner;
public class cbseresult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Here, We are ready to find the % of a particular student by taking input of each subject from the user.");
        System.out.println("");

        System.out.println("Enter the name of the student: ");
        String Name = sc.nextLine();

        System.out.println("Enter the Date of Birth of the student: ");
        String DOB = sc.nextLine();

        System.out.println("");

        System.out.println("Now enter the marks score in each subject out of 100.");

        System.out.print("Mathematics:");
        int Mathematics= sc.nextInt();

        System.out.print("English : ");
        int English=sc.nextInt();

        System.out.print("Social Studies : ");
        int Social_Studies=sc.nextInt();

        System.out.print("Science : ");
        int Science=sc.nextInt();

        System.out.print("Hindi : ");
        int Hindi=sc.nextInt();
        System.out.println("");
        System.out.println("All the details received by the user is as diplayed below:");
        System.out.println("");
        System.out.println("Name of the student is: "+Name);
        System.out.println("DOB of the student is : "+DOB);
        System.out.println("Marks scored in Mathematics:"+Mathematics);
        System.out.println("Marks scored in English:"+English);
        System.out.println("Marks scored in Social Studies:"+Social_Studies);
        System.out.println("Marks scored in Science:"+Science);
        System.out.println("Marks scored in Hindi:"+Hindi);

        System.out.println("");

        System.out.println("Now , We need to calculate the total marks scored by the student out of 500.");
        System.out.println("");
        int Total_Marks;
        Total_Marks = Mathematics+English+Social_Studies+Science+Hindi;
        System.out.println("The total marks scored by the student out of 500 is :"+Total_Marks);
        System.out.println("");
        System.out.println("Now,We will calculate the % of marks.");
        System.out.println("");
        float Percentage;
        Percentage=((float)Total_Marks*100)/500;
        System.out.println("The Percentage of marks score is : "+Percentage);  

        sc.close();
    }
}
