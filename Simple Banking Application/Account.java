import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        System.out.print("Please enter your customer ID: ");
        String id = input.nextLine();

        BankAccount acc = new BankAccount(name, id);
        acc.showMenu();
    }
}
