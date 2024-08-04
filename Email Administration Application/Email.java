import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private String email;
    private String alternateEmail;

    private final int passwordLength = 10;
    private String companyName = "xyzcompany.com";
    private int mailBoxCapacity = 500;

    Scanner input = new Scanner(System.in);

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        this.password = randomPassword(passwordLength);

        System.out.println("\nYour random password is: " + this.password);

        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@";
        if(department == null) {
            email += companyName;
        } else {
            email += department + "." + companyName;
        }
    }

    public String setDepartment() {
        System.out.println("\nAvailable departments code: ");
        System.out.print("0. for none\n1. for Sales\n2. for Development\n3. " +
                "for Accounting\nEnter department code: ");
        int depChoice = input.nextInt();

        if(depChoice == 1) {return "sales";}
        else if(depChoice == 2) {return "dev";}
        else if(depChoice == 3) {return "acct";}
        else {return null;}
    }

    private String randomPassword(int length) {
        String passwordSet= "ABCDEFGHIJKLNMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];

        for(int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public void setCapacity(int capacity) {
        this.mailBoxCapacity = capacity;
    }
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }
    public void changePassword(String password) {
        this.password = password;
    }

    public String getAlternateEmail() {
        if(alternateEmail == null) {
            return email;
        }
        return alternateEmail;
    }

    public String show() {
        return "\nDisplay name: " + firstName + " " + lastName +
                "\nMailBox Capacity: " + mailBoxCapacity + "mb" +
                "\nCompany Email: " + email;
    }

    public void menu() {
        System.out.println(show());

        System.out.println("\nNow What you wanna do: ");
        System.out.println("1. Change password.");
        System.out.println("2. Change Email address.");
        System.out.println("3. Set new MailBox capacity.");
        System.out.println("4. Show password.");
        System.out.println("5. Show Email address.");
        System.out.println("6. Show MailBox capacity.");
        System.out.println("7. Nothing.");

        int choice;
        do {
            System.out.print("\nEnter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch(choice) {
                case 1:
                    System.out.print("Enter new Password: ");
                    String newPass = input.nextLine();
                    changePassword(newPass);
                    System.out.println("New Password has been set.");
                    break;
                case 2:
                    System.out.println("Enter your new Email in appropriate format.");
                    System.out.print("name@companyName: ");
                    String altEmail = input.nextLine();
                    setAlternateEmail(altEmail);
                    System.out.println("Your new Email registered successfully.");
                    break;
                case 3:
                    System.out.print("Enter new MailBox capacity: ");
                    int cap = input.nextInt();
                    setCapacity(cap);
                    System.out.println("New capacity set successfully.");
                    break;
                case 4: System.out.println("Your password is: " + password);
                    break;
                case 5: System.out.println("Your Email is: " + getAlternateEmail());
                    break;
                case 6: System.out.println("You MaikBox capacity is: " + mailBoxCapacity + "mb");
                    break;
                case 7: System.out.println("\nThank You!");
                    break;
                default: System.out.println("\nPlease enter valid choice.");
                    break;
            }
        } while (choice != 7);
    }
}
