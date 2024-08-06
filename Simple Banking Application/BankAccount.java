import java.util.Scanner;

public class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;

    BankAccount(String cName, String cID) {
        customerName = cName;
        customerID = cID;
    }

    void deposit(int amount) {
        if (amount != 0) {
            balance += amount;
            previousTransaction = amount;
            System.out.println("Successfully Deposited Rs." + amount);
        }
    }

    void withdraw(int amount) {
        if (amount != 0) {
            balance -= amount;
            previousTransaction = -amount;
            System.out.println("Successfully Withdrawn Rs." + amount);
        }
    }

    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No transaction occurred");
        }
    }

    void calculateInterest(int years) {
        double interestRate = .0650;
        double newBalance = (balance * interestRate * years) + balance;
        System.out.println("The current rate of interest is " + (100 * interestRate) + "%");
        System.out.println("After " + years + " years, your balance will be: " + newBalance);
        System.out.println();
    }

    void showMenu() {
        Scanner input = new Scanner(System.in);

        int option;
        System.out.println();
        System.out.println("Welcome, " + customerName + "!");
        System.out.println("Your ID is: " + customerID);
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println("1. Check your balance");
        System.out.println("2. Make a deposit");
        System.out.println("3. Make a withdrawal");
        System.out.println("4. View previous transaction");
        System.out.println("5. Calculate interest");
        System.out.println("6. Exit");
        System.out.println();

        do {
            System.out.print("Please enter your choice: ");
            option = input.nextInt();
            System.out.println();

            switch(option) {
                case 1:
                    System.out.println("====================================");
                    System.out.println("Balance = $" + balance);
                    System.out.println("====================================");
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter an amount to deposit: ");
                    int amount = input.nextInt();
                    deposit(amount);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Enter an amount to withdraw: ");
                    int amount2 = input.nextInt();
                    withdraw(amount2);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("====================================");
                    getPreviousTransaction();
                    System.out.println("====================================");
                    System.out.println();
                    break;
                case 5:
                    System.out.print("Enter for how many years you want: ");
                    int years = input.nextInt();
                    calculateInterest(years);
                    break;
                case 6:
                    System.out.println("====================================");
                    break;
                default:
                    System.out.println("Please enter valid choice.");
                    break;
            }
        } while(option != 6);
        System.out.println("Thank you for banking with us!");
    }
}
