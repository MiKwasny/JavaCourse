package JavaCourse_Section_7_Encapsulation;

public class Main {
    public static void main(String[] args) {

//        Player player = new Player();
//
//        player.name = "Skywalker";
//        player.health = 100;
//        player.Weapon = "Two Handed Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = "+ player.healthRemaining());
//
//        damage = 100;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = "+ player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Skywalker", 999, "Sword");
        player.loseHealth(60);
        System.out.println("Remaining health = "+player.getHealth());
    }

}
