
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCurrentAccount {

    private CurrentAccount account;

    @BeforeEach
    public void setUp() {
        account = new CurrentAccount(500.0, 100.0, "Alice", 200);
    }

    // Test constructor
    @Test
    public void testConstructor() {
        assertEquals(200.0, account.getMaximumWithdrawalAmount(), "Constructor - maximum withdrawal amount incorrect");
    }

    // Test getters
    @Test
    public void testGetters() {
        assertEquals(200.0, account.getMaximumWithdrawalAmount(), "Getter - maximum withdrawal amount incorrect");
    }

    // Test setters
    @Test
    public void testSetters() {
        account.setMaximumWithdrawalAmount(300);
        assertEquals(300.0, account.getMaximumWithdrawalAmount(), "Setter - maximum withdrawal amount incorrect");
    }

    // Test toString method
    @Test
    public void testToString() {
        String expected = "BankAccount{accountBalance=500.0, minimumBalance=100.0, accountHolderName='Alice', maximumWithdrawalAmount='200.0'}";
        assertEquals(expected, account.toString(), "toString method incorrect");
    }


    // Test withdraw method
    @Test
    public void testWithdraw() {
        account.withdraw(250.0);
        assertEquals(500.0, account.getAccountBalance(), "Withdraw above max withdrawal amount should not change balance");
    }

}
