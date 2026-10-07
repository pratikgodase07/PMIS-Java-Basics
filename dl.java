import java.util.Scanner;

class dl
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter an age: ");
        int age = sc.nextInt();
        
        System.out.print("Do you have a driving license? (true/false): ");
        boolean drivingLicense = sc.nextBoolean();

        if(age>=18 && drivingLicense==true)
         
        {
            System.out.println("You are eligible to driving license.");
        }
        else
        {
            System.out.println("You are not eligible to driving license.");
        }

        sc.close();

    }
}