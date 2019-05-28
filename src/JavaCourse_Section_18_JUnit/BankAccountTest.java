package JavaCourse_Section_18_JUnit;

import org.junit.*;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class BankAccountTest {
    private BankAccount account;
    public static int count;


    @BeforeClass
    public static void beforeClass(){
        System.out.println("This executes before any cases. Count: "+count++);
    }
    @Before
    public void setup(){
        account = new BankAccount("Tim", "Buchak", 1000, BankAccount.CHECKING);
        System.out.println("Running test");
    }

    @Test
    public void getBalance_deposit() {

        account.deposit(1000.00, true);
        assertEquals(2000, account.getBalance(),0);
    }

    @Test
    public void getBalance_withdraw() {

        account.withdraw(1000.00, true);
        assertEquals(0, account.getBalance(),0);
    }

    @Test
    public void deposit() {

        double balance = account.deposit(1000.00, true);
        assertEquals(2000,balance,0);
        assertEquals(2000, account.getBalance(),0);
    }

    @Test
    public void isChecking_true(){

        boolean accType = account.isCHECKING();
        assertTrue("Account is not a checking account", accType);
    }

//    @Test
//    public void isSavings_true(){
//        BankAccount account = new BankAccount("Tim", "Buchak", 1000, BankAccount.SAVINGS);
//        boolean accType = account.isSAVING();
//        assertTrue("Account is not a savings account", accType);
//
//    }

    @Test
    public void withdrawBranch() throws Exception{
        double balance = account.withdraw(600,true);
        assertEquals(400, balance,0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void withdrawNotBranch() throws Exception{
            account.withdraw(600, false);
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("this executes after any test cases. Count: "+count++);

    }
    @After
    public void tearDown(){
        System.out.println(". Count: "+count++);
    }


}