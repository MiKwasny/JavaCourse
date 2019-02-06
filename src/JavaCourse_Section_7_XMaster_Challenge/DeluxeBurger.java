package JavaCourse_Section_7_XMaster_Challenge;

public class DeluxeBurger extends Hamburger{


    public DeluxeBurger() {
        super("Deluxe", "Sausage and bacon", 42.4, "White");
        super.addHamburgerAddition1("Chips",2.12);
        super.addHamburgerAddition2("drink", 1.82);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add more additions to this burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add more additions to this burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add more additions to this burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add more additions to this burger");
    }
}
