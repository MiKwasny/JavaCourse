package JavaCourse_Section_9_AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("york");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Emperor");
        parrot.eat();
        parrot.breathe();
        parrot.fly();



    }
}
