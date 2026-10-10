package october_8th.oops;

import java.util.Scanner;

class CoffeeWalletMenu {
    String studentName;
    double balance;

    public CoffeeWalletMenu(String name, double initialDeposit) 
    {
        this.studentName = name;
        
        // Validate that initial deposit cannot be negative
        if (initialDeposit >= 0) 
        {
            this.balance = initialDeposit;
            System.out.println("\nAccount successfully created for " + studentName + " with an initial deposit of ₹" + balance);
        }
        else
        {
            this.balance = 0.0;
            System.out.println("\nInvalid initial deposit! Initial balance set to ₹0.0 for " + studentName);
        }
    }

    public void addFunds(double amount)
    {
        // Validate that user cannot add a negative or zero amount
        if (amount > 0) 
        {
            balance += amount;
            System.out.println("-> Added ₹" + amount + ". Current balance: ₹" + balance);
        } 
        else
        {
            System.out.println("-> Invalid amount! Cannot add negative or zero funds.");
        }
    }

    public void makePurchase(double amount) 
    {
        if (amount <= 0)
        {
            System.out.println("-> Invalid purchase amount.");
            return;
        }
        
        if (amount <= balance)
        {
            balance -= amount;
            System.out.println("-> Successfully purchased item worth ₹" + amount + ". Remaining balance: ₹" + balance);
        } 
        else
        {
            System.out.println("-> Insufficient funds! Transaction of ₹" + amount + " blocked. Balance remains: ₹" + balance);
        }
    }

    public void accountOverview() {
        System.out.println("\n--- Account Overview ---");
        System.out.println("Student Name : " + studentName);
        System.out.println("Current Balance: ₹" + balance);
        System.out.println("------------------------");
    }
}

public class CoffeeWalletTest {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter initial opening deposit amount (₹): ");
        double initialDeposit = scanner.nextDouble();

        CoffeeWalletMenu myWallet = new CoffeeWalletMenu(name, initialDeposit);

        int choice;
        do {
            System.out.println("\n===== CAMPUS COFFEE WALLET MENU =====");
            System.out.println("1. Add Funds (Top Up)");
            System.out.println("2. Make a Purchase");
            System.out.println("3. View Account Overview");
            System.out.println("4. Exit / Go back");
            System.out.print("Choose an option (1-4): ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to add (₹): ");
                    double topUp = scanner.nextDouble();
                    myWallet.addFunds(topUp);
                    break;

                case 2:
                    System.out.print("Enter purchase amount (₹): ");
                    double purchase = scanner.nextDouble();
                    myWallet.makePurchase(purchase);
                    break;

                case 3:
                    myWallet.accountOverview();
                    break;

                case 4:
                    System.out.println("Thank you for using Campus Coffee Wallet. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please choose between 1 and 4.");
            }
        } while (choice != 4);

        scanner.close();
    }
}