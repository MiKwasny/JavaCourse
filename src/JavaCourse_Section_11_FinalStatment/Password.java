package JavaCourse_Section_11_FinalStatment;

public class Password {
    private static final int key = 123456;
    private final int encyptedPassword;

    public Password(int Password) {
        this.encyptedPassword = encryptDecrypt(Password);
    }

    private int encryptDecrypt(int Password) {
        System.out.println(Password ^ key);
        return Password ^ key;
    }

    public final void storePassword() {
        System.out.println("saving password as " + this.encyptedPassword);
    }

    public boolean letMein(int password) {
        if (encryptDecrypt(password) == this.encyptedPassword) {
            System.out.println("welcome");
            return true;
        } else {
            System.out.println("you cant");
            return false;
        }
    }
}
