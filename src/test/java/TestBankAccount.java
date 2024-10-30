import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestBankAccount {

    private BankAccount account;

    @BeforeEach
    public void setUp() {
        account = new BankAccount(500.0, 100.0, "Alice");
    }

    // Test constructor
    @Test
    public void testConstructor() {
        assertEquals(500.0, account.getAccountBalance(), "Constructor - account balance incorrect");
        assertEquals(100.0, account.getMinimumBalance(), "Constructor - minimum balance incorrect");
        assertEquals("Alice", account.getAccountHolderName(), "Constructor - account holder name incorrect");
    }

    // Test getters
    @Test
    public void testGetters() {
        assertEquals(500.0, account.getAccountBalance(), "Getter - account balance incorrect");
        assertEquals(100.0, account.getMinimumBalance(), "Getter - minimum balance incorrect");
        assertEquals("Alice", account.getAccountHolderName(), "Getter - account holder name incorrect");
    }

    // Test setters
    @Test
    public void testSetters() {
        account.setAccountBalance(600.0);
        assertEquals(600.0, account.getAccountBalance(), "Setter - account balance incorrect");

        account.setMinimumBalance(150.0);
        assertEquals(150.0, account.getMinimumBalance(), "Setter - minimum balance incorrect");

        account.setAccountHolderName("Bob");
        assertEquals("Bob", account.getAccountHolderName(), "Setter - account holder name incorrect");
    }

    // Test toString method
    @Test
    public void testToString() {
        String expected = "BankAccount{accountBalance=500.0, minimumBalance=100.0, accountHolderName='Alice'}";
        assertEquals(expected, account.toString(), "toString method incorrect");
    }

    // Test deposit method
    @Test
    public void testDeposit() {
        account.deposit(200.0);
        assertEquals(700.0, account.getAccountBalance(), "Deposit method failed");

        account.deposit(0.0); // Deposit zero amount
        assertEquals(700.0, account.getAccountBalance(), "Deposit zero amount failed");

        account.deposit(-100.0); // Deposit negative amount (Assuming deposit should allow only positive values)
        assertEquals(700.0, account.getAccountBalance(), "Deposit negative amount should not change balance");
    }

    // Test withdraw method
    @Test
    public void testWithdraw() {
        account.withdraw(200.0);
        assertEquals(300.0, account.getAccountBalance(), "Withdraw method failed");

        account.withdraw(250.0); // Attempt to withdraw below minimum balance
        assertEquals(300.0, account.getAccountBalance(), "Withdraw below minimum balance should not change balance");

        account.withdraw(300.0); // Withdraw full remaining balance, exactly at minimum
        assertEquals(0.0, account.getAccountBalance(), "Withdraw remaining balance failed");
    }
}
