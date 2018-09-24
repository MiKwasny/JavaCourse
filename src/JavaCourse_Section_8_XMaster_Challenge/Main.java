package JavaCourse_Section_8_XMaster_Challenge;

public class Main {

    public static void main(String[] args) {

        //Hamburger hambuger = new Hamburger("Basic", "sausage", 3.56, "White" );

        /*double price = hambuger.itemizeHamburger();
        hambuger.addHamburgerAddition1("Tomato",2.1);
        hambuger.addHamburgerAddition2("Chees",1.76);
        hambuger.addHamburgerAddition3("Lettuce",0.64);
        hambuger.addHamburgerAddition4("Meat",8.12);
        System.out.println("Total price is: " + hambuger.itemizeHamburger());*/

        HealthyBurger healthyBurger =  new HealthyBurger("Bacon", 5.67);

        healthyBurger.addHamburgerAddition1("Egg", 5.23);

        healthyBurger.addHealthAddition1("Broccoli", 212);


        System.out.println("Total price is: " + healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizeHamburger();
    }
}
