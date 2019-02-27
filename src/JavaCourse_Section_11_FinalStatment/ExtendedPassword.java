package JavaCourse_Section_11_FinalStatment;

public class ExtendedPassword extends  Password{
    private int decryptedPassword;

    public ExtendedPassword(int Password) {
        super(Password);
        this.decryptedPassword = Password;
    }

//    @Override
//    public void storePassword() {
//        System.out.println("saving password as "+this.decryptedPassword);
//    }
}
