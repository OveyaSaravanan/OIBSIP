import java.util.Scanner;

public class ATMInterface {
    
    // initial account balance
    private static double balance = 1000.00;
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the ATM!");
        System.out.println("-------------------");
        
        while (true) {
            
            // Print out menu options
            System.out.println("Please select an option:");
            System.out.println("1. View Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");
            
            // Get user input for menu selection
            int choice = scanner.nextInt();
            
            switch (choice) {
                
                case 1:
                    // View balance
                    System.out.println("Your current balance is $" + balance);
                    break;
                    
                case 2:
                    // Deposit
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    balance += depositAmount;
                    System.out.println("Your new balance is $" + balance);
                    break;
                    
                case 3:
                    // Withdraw
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    if (withdrawalAmount > balance) {
                        System.out.println("Insufficient funds!");
                    } else {
                        balance -= withdrawalAmount;
                        System.out.println("Your new balance is $" + balance);
                    }
                    break;
                    
                case 4:
                    // Transfer
                    System.out.print("Enter transfer amount: $");
                    double transferAmount = scanner.nextDouble();
                    if (transferAmount > balance) {
                        System.out.println("Insufficient funds!");
                    } else {
                        System.out.print("Enter recipient account number: ");
                        int recipientAccount = scanner.nextInt();
                        balance -= transferAmount;
                        System.out.println("Transfer of $" + transferAmount + " to account " + recipientAccount + " was successful.");
                        System.out.println("Your new balance is $" + balance);
                    }
                    break;
                    
                case 5:
                    // Quit
                    System.out.println("Thank you for using the ATM!");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            
            System.out.println(); // Print empty line for spacing
            
        }
        
    }
    
}
