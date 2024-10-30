import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount(500, 50, "Ana");
        BankAccount bankAccount2 = new BankAccount(600, 60, "Rohan");
        SavingsAccount savingsAccount1 = new SavingsAccount(1000, 100, "Jordan", 5);
        CurrentAccount currentAccount1 = new CurrentAccount(600, 100, "Dylan", 300);

        ArrayList<BankAccount> accountsArray = new ArrayList<BankAccount>();
        accountsArray.add(bankAccount1);
        accountsArray.add(bankAccount2);
        accountsArray.add(savingsAccount1);
        accountsArray.add(currentAccount1);

        for (BankAccount b : accountsArray) {
            System.out.println(b);
        }

    }
}
