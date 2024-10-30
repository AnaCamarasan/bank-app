
public class SavingsAccount extends BankAccount {

        private double interestRate;

    public SavingsAccount(double accountBalance, double minimumBalance, String accountHolderName, double interestRate) {
        super(accountBalance, minimumBalance, accountHolderName);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
            return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interestRate=" + interestRate +
                ", accountBalance=" + this.getAccountBalance() +
                ", minimumBalance=" + this.getMinimumBalance() +
                ", accountHolderName=" + this.getAccountHolderName() +
                '}';
    }
}
