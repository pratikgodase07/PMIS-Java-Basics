import java.util.*;
public class calculator {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a choice");
        int choice = sc.nextInt();

        switch(choice)
        {
            case 1:
                System.out.println("Enter side: ");
                double side = sc.nextDouble();
                System.out.println("Area of square: " + areaOfSquare(side));
                break;

            case 2:
                System.out.println("Enter base: ");
                double base = sc.nextDouble();
                System.out.println("Enter height: ");
                double height = sc.nextDouble();
                System.out.println("Area of triangle: " + areaOfTriangle(base, height));
                break;

            case 3: 
            System.out.println("Enter length:");
            double length=sc.nextDouble();

            System.out.println("Enter breadth: ");
            double breadth=sc.nextDouble();
            System.out.println("Area of rectangle: " + areaOfRectangle(length, breadth));
            break;

            default:
                System.out.println("Invalid choice");
        }
        
    }
    //area of triangle
    public static double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    public static double areaOfSquare(double side) {
        return side * side;
    }

    public static double areaOfRectangle(double length, double breadth)
    {
        return length*breadth;
    }


}
