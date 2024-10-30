public class CurrentAccount extends BankAccount{
    private double maximumWithdrawalAmount;

    // All args constructor
    public CurrentAccount(double accountBalance, double minimumBalance, String accountHolderName, double maximumWithdrawalAmount) {
        super(accountBalance, minimumBalance, accountHolderName);
        this.maximumWithdrawalAmount = maximumWithdrawalAmount;
    }

    public double getMaximumWithdrawalAmount() {
        return maximumWithdrawalAmount;
    }

    public void setMaximumWithdrawalAmount(double maximumWithdrawalAmount) {
        this.maximumWithdrawalAmount = maximumWithdrawalAmount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > maximumWithdrawalAmount) {
            System.out.println("Withdrawal failed. Cannot withdraw more than £" + maximumWithdrawalAmount);
        } else {
            super.withdraw(amount);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > maximumWithdrawalAmount) {
            System.out.println("Withdrawal failed. Cannot withdraw more than £" + maximumWithdrawalAmount);
        } else {
            super.withdraw(amount);
        }
    }
}
