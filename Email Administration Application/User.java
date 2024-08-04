import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        String first = input.nextLine();
        System.out.println("Now enter your last name: ");
        String last = input.nextLine();

        Email email = new Email(first, last);
        email.menu();
    }
}
