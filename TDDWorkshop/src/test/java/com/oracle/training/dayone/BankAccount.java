import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    
    @Test
    void testInitialBalance() {
        BankAccount account = new BankAccount("12345", 1000.0);
        assertEquals(1000.0, account.getBalance());  // This test will fail because BankAccount does not exist
    }
}
