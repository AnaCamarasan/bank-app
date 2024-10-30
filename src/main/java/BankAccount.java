public class BankAccount {
    private double accountBalance;
    private double minimumBalance;
    private String accountHolderName;

    public BankAccount(double accountBalance, double minimumBalance, String accountHolderName) {
        this.accountBalance = accountBalance;
        this.minimumBalance = minimumBalance;
        this.accountHolderName = accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void deposit (double amount) {
        accountBalance += amount;
        System.out.println("Deposit successful.");
    }

    public void withdraw (double amount) {
        if (accountBalance - amount < minimumBalance) {
            System.out.println("Withdrawal failed. Insufficient funds.");
        } else {
            accountBalance -= amount;
            System.out.println("Withdrawal successful.");
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountBalance=" + accountBalance +
                ", minimumBalance=" + minimumBalance +
                ", accountHolderName='" + accountHolderName + '\'' +
                '}';
    }
}
