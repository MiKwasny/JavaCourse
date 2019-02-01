package JavaCourse_Section_8_Polymorphism_Exercise;

class Car {

    private boolean Engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.Engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return getClass().getSimpleName() + " -> start engine";
    }

    public String accelerate() {

        return getClass().getSimpleName() + " -> accelerated";
    }

    public String brake() {
        return getClass().getSimpleName() + " -> break";
    }
}

class Honda extends Car{
    public Honda(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> start engine";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerated";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> break";
    }
}

class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden -> start engine";
    }

    @Override
    public String accelerate() {
        return "Holden -> accelerated";
    }

    @Override
    public String brake() {
        return "Holden -> break";
    }
}

class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford -> start engine";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerated";
    }

    @Override
    public String brake() {
        return "Ford -> break";
    }
}


public class Main {
    public static void main(String[] args) {

        Car car = new Car(8,"Typical");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

//        Honda honda = new Honda(12,"Honda vrc 400");
//        System.out.println(honda.startEngine());
//        System.out.println(honda.accelerate());
//        System.out.println(honda.brake());
//
//        Ford ford = new Ford(12,"Ford Focus MK2");
//        System.out.println(ford.startEngine());
//        System.out.println(ford.accelerate());
//        System.out.println(ford.brake());

        Car holden = new Car(12,"Holden superb");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

    }

}
