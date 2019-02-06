package JavaCourse_Section_9_Interfaces;

public class Main {
    public static void main(String[] args) {
        ITelephone TimPhone = new DeskPhone(12345);

        TimPhone.powerOn();
        TimPhone.callPhone(12345);
        TimPhone.answer();
    }

}
