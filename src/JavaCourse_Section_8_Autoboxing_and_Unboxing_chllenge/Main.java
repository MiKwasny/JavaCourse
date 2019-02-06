package JavaCourse_Section_8_Autoboxing_and_Unboxing_chllenge;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Polish Bank");
        bank.addBranch("Warsaw");
        bank.addCustomer("Warsaw", "Michal", 12.12);
        bank.addCustomer("Warsaw", "Tomek", 221.2);

        bank.addBranch("lol");
        bank.addCustomer("lol","lol", 12);

        bank.addCustomerTransaction("Warsaw", "Tomek", 20);
        bank.listCustomers("Warsaw", true);


        bank.addBranch("Melbourne");

        if(!bank.addCustomer("Melbourne", "Brian", 5.53)) {
            System.out.println("Error Melbourne branch does not exist");
        }

        if(!bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch already exists");
        }

        if(!bank.addCustomerTransaction("Adelaide", "Fergus", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

        if(!bank.addCustomer("Adelaide", "Tim", 12.21)) {
            System.out.println("Customer Tim already exists");
        }

    }
}
