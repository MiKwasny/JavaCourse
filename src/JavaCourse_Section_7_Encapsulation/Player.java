package JavaCourse_Section_7_Encapsulation;

public class Player {

    public String name;
    int health;
    public String Weapon;

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("Player dead");
            //Reduce number of lives of player
        }
    }

    public int healthRemaining(){
        return this.health;

    }
}
