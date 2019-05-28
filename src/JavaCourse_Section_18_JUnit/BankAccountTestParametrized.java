//package JavaCourse_Section_18_JUnit;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;
//
//import java.util.Arrays;
//import java.util.Collection;
//
//import static junit.framework.TestCase.assertEquals;
//
//@RunWith(Parameterized.class)
//public class BankAccountTestParametrized {
//
//    private BankAccount account;
//    private double amount;
//    private boolean branch;
//    private double expected;
//
//    public BankAccountTestParametrized(double amount, boolean branch, double expected) {
//        this.amount = amount;
//        this.branch = branch;
//        this.expected = expected;
//    }
//
//    @Before
//    public void setup(){
//        account = new BankAccount("Tim", "Kwasek", 2000, BankAccount.SAVINGS);
//        System.out.println("Running test");
//
//    }
//
//    @Parameterized.Parameters
//    public static Collection<Object> testConditions(){
//        return Arrays.asList(new Object[][]{
//                {100, true, 2100},
//                {200, true, 2200},
//                {325.14, true, 2325.14},
//                {472.12, true, 2472.12},
//                {1325.14, true, 3325.1400000000003},
//        });
//    }
//
//    @Test
//    public void deposit() {
//
//        account.deposit(amount, branch);
//        assertEquals(expected, account.getBalance(),0.1);
//    }
//}
