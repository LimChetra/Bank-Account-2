public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount ("1234567890", 1000.0, "John Doe", "johndoe@example.com", "1234567890");

        account.displayAccountDetails();

        account.depositFunds(500.0);
        account.withdrawFunds(200.0);

        account.displayAccountDetails();
    }
}