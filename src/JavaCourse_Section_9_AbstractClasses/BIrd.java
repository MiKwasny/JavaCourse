package JavaCourse_Section_9_AbstractClasses;

public abstract class BIrd extends Animal implements CanFly {

    public BIrd(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" pecking");
    }

    @Override
    public void breathe() {
        System.out.println(getName()+" breathing");

    }

    @Override
    public void fly() {
        System.out.println(getName() +" is flapping wings");

    }


}
