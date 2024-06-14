// Main class to test inheritance and exception handling
public class Account {
    public static void main(String[] args) {
        SavingsAccount myAccount = new SavingsAccount("123456", 1000.0, 5.0);

        myAccount.displayBalance();
        myAccount.deposit(500.0);
        myAccount.applyInterest();

        try {
            myAccount.withdraw(2000.0);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        myAccount.displayBalance();
    }
}