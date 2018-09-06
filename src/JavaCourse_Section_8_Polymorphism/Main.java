package JavaCourse_Section_8_Polymorphism;

class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "A shark eats a lot of people";
    }
}

class IndependenceDay extends Movie{

    public IndependenceDay() {
        super("Independence day");
    }

    @Override
    public String plot() {
        return "Aliens attempt tot ake over the earth";
    }
}
public class Main {
    public static void main(String[] args) {

    }
}
