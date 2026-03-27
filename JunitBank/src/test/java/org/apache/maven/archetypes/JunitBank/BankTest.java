package org.apache.maven.archetypes.JunitBank;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
public class BankTest {
	 static Bank bank;

	    @BeforeAll
	    static void init() {
	        System.out.println("DB Connected");
	    }

	    @BeforeEach
	    void setup() {
	        bank = new Bank(1, "User", "mail", 2000);
	    }

	    @Test
	    void testWithdrawValid() {
	        bank.withdraw(300);
	        assertEquals(1700, bank.getBalance());
	    }

	    @Test
	    void testWithdrawBelowMinimum() {
	        bank.withdraw(600);
	        assertTrue(bank.getBalance() >= 1500);
	    }

	    @Test
	    void testOpenAccount() {
	        Bank newBank = new Bank(2, "NewUser", "mail", 1500);
	        assertEquals(1500, newBank.getBalance());
	    }

	    @AfterEach
	    void checkMinimumBalance() {
	        assertTrue(bank.getBalance() >= 1500,
	            "Minimum balance violated!");
	    }

	    @AfterAll
	    static void cleanup() {
	        System.out.println("DB Closed");
	    }	

}
