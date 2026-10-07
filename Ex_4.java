import java.util.Scanner;
class Ex_4
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter a num1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter a num2: ");
        int num2 = sc.nextInt();

        if(num1>num2)
        {
            System.out.println("num1>num2");

        }
        else if(num1<num2)
        {
            System.out.println("num1<num2");
        }
        else
        {
            System.out.println("num1=num2");
        }
    }
}