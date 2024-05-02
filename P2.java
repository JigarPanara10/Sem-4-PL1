public class P2 {
    private static class BankAccount {
        private int balance;

        public BankAccount(int initialBalance) {
            this.balance = initialBalance;
        }

        public void deposit(int amount) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", Balance: " + balance);
        }

        public void withdraw(int amount) throws Exception {
            if (balance < amount) {
                throw new Exception("Not Sufficient Fund");
            }
            balance -= amount;
            System.out.println("Withdraw: " + amount + ", Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);

        account.deposit(5000);

        try {
            account.withdraw(2000);
            account.withdraw(1500);
            account.withdraw(3500);
            account.withdraw(500);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}