public class Account {
    private String Depositorname;
    private long accountNumber;
    private String typeOfAccount;
    private double balance;

    public Account(String Depositorname, long accountNumber, String typeOfAccount, double initialBalance) {
        this.Depositorname = Depositorname;
        this.accountNumber = accountNumber;
        this.typeOfAccount = typeOfAccount;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }
        
        if (balance + amount < 1000) {
            System.out.println("Minimum balance requirement not met.");
            return;
        }
        
        balance += amount;
        System.out.println(amount + " Rp. deposited successfully.");
    }

    public void displayAccountInfo() {
        System.out.println("Name of Depositor: " + Depositorname);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Type of Account: " + typeOfAccount);
        System.out.println("Current Balance: " + balance + " Rp.");
    }

    public static void main(String[] args) {
        Account myAccount = new Account("Alice", 123456789, "Savings", 2000.0);
        
        myAccount.deposit(1500); // Valid deposit
        myAccount.displayAccountInfo();
    }
}
