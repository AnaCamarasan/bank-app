
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

}
