public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // Parameter constructor
    public BankAccount (String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Method to deposit funds
    public void depositFunds(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of " + amount + " successfully made.");
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    // Method to withdraw funds
    public void withdrawFunds(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawal of " + amount + " successfully made.");
            } else {
                System.out.println("Insufficient balance. Unable to withdraw funds.");
            }
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Current Balance: " + balance);
    }
}
