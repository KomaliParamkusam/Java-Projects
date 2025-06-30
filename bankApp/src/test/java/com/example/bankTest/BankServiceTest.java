package com.example.bankTest;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import com.example.bankService.BankAccountService;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)   //for creating only one instance 
@DisplayName("Bank Account Service Tests")      //readable name for test class
public class BankServiceTest {

    private BankAccountService account;

    @BeforeAll     //executes before all test cases
    void initAll() 
    {
        System.out.println("==> Starting Bank Account Tests");
    }

    @AfterAll
    void tearDownAll() {
        System.out.println("==> Finished Bank Account Tests");
    }

    @BeforeEach
    void init() 
    {
        account = new BankAccountService("AB1234", 1000.00);
        System.out.println("Account created with balance: " + account.getBalance());
    }

    @AfterEach
    void clean() {
        System.out.println("Test completed for account: " + account.getAccountNumber());
    }

    @Test
    @DisplayName("Initial balance should be correct")
    void testInitialBalance() 
    {
        assertEquals(1000.00, account.getBalance());
    }

    @Test
    @DisplayName("Successful deposit")
    void testDeposit() {
        account.deposit(500.00);
        assertEquals(1500.00, account.getBalance());
    }

    @Test
    @DisplayName("Deposit with negative amount should fail")
    void testNegativeDeposit() {
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-100));
    }

    @Test
    @DisplayName("Withdrawal success")
    void testWithdraw() {
        account.withdraw(400.00);
        assertEquals(600.00, account.getBalance());
    }

    @Test
    @DisplayName("Withdraw more than balance should fail")
    void testOverWithdraw() {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(2000.00));
    }

    @ParameterizedTest
    @ValueSource(strings = {"AB1234", "CD5678", "XY0001"})
    @DisplayName("Valid account number formats")
    void testValidAccountNumbers(String accNumber) {
        BankAccountService testAccount = new BankAccountService(accNumber, 100);
        assertNotNull(testAccount);
    }

    @ParameterizedTest
    @ValueSource(strings = {"1234", "A123", "XYZ000", "null", ""})
  
    @DisplayName("Invalid account numbers should throw exception")
    void testInvalidAccountNumbers(String accNumber) 
    {
        assertThrows(IllegalArgumentException.class, () -> new BankAccountService(accNumber, 100));
    }

    @Test
    @DisplayName("Assume test only runs if balance > 0")
    void testAssumptionOnBalance() 
    {
        assumeTrue(account.getBalance() > 0, "Test runs only for positive balance");
        assertTrue(account.getBalance() > 0);
    }

    @Test
    @DisplayName("assumingThat balance check")
    void testAssumingThat() {
        assumingThat(account.getBalance() > 500, () -> {
            System.out.println("Balance is high, run premium check...");
            assertTrue(account.getBalance() >= 1000);
        });
    }
}
