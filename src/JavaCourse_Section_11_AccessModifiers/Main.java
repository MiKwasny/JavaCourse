package JavaCourse_Section_11_AccessModifiers;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("Michas");
        account.deposit(1000);
        account.withdraw(400);
        account.calculateBalance();

        System.out.println(account.getBalance());
    }


}
