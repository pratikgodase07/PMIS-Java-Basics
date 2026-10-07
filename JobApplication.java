import java.util.Scanner;

public class JobApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Do you know Python? (yes/no): ");
        String python = sc.nextLine();

        System.out.print("Do you know French? (yes/no): ");
        String french = sc.nextLine();

        if (python.equalsIgnoreCase("yes") && french.equalsIgnoreCase("yes")) {
            System.out.println("You can apply");
        }
        else if (python.equalsIgnoreCase("yes") && french.equalsIgnoreCase("no")) {
            System.out.println("You need to learn French");
        }
        else if (python.equalsIgnoreCase("no") && french.equalsIgnoreCase("yes")) {
            System.out.println("You need to learn Python");
        }
        else {
            System.out.println("You need to learn Python and French");
        }

        sc.close();
    }
}