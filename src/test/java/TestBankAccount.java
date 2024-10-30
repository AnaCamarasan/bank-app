public class TestBankAccount {
    public static void main(String[] args) {
        testConstructor();
        testGetters();
        testSetters();
        testToString();
        System.out.println("All tests passed.");
    }

    // Test constructor
    public static void testConstructor() {
        BankAccount account = new BankAccount(500.0, 100.0, "Alice");
        
        assert account.getAccountBalance() == 500.0 : "Constructor - account balance incorrect";
        assert account.getMinimumBalance() == 100.0 : "Constructor - minimum balance incorrect";
        assert account.getAccountHolderName().equals("Alice") : "Constructor - account holder name incorrect";
    }

    // Test getters
    public static void testGetters() {
        BankAccount account = new BankAccount(500.0, 100.0, "Alice");
        
        assert account.getAccountBalance() == 500.0 : "Getter - account balance incorrect";
        assert account.getMinimumBalance() == 100.0 : "Getter - minimum balance incorrect";
        assert account.getAccountHolderName().equals("Alice") : "Getter - account holder name incorrect";
    }

    // Test setters
    public static void testSetters() {
        BankAccount account = new BankAccount(500.0, 100.0, "Alice");
        
        account.setAccountBalance(600.0);
        assert account.getAccountBalance() == 600.0 : "Setter - account balance incorrect";
        
        account.setMinimumBalance(150.0);
        assert account.getMinimumBalance() == 150.0 : "Setter - minimum balance incorrect";
        
        account.setAccountHolderName("Bob");
        assert account.getAccountHolderName().equals("Bob") : "Setter - account holder name incorrect";
    }

    public static void testToString() {
        BankAccount account = new BankAccount(500.0, 100.0, "Alice");
        
        String expected = "BankAccount{accountBalance=500.0, minimumBalance=100.0, accountHolderName='Alice'}";
        assert account.toString().equals(expected) : "toString method incorrect";
    }
}