package JavaCourse_Section_12_CollectionsOverview;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian",4,4);
        theatre.getSeat();
        if(theatre.reserveSeat("A1")){
            System.out.println("Please pat");
        }else{
            System.out.println("Sit taken");
        }


    }
}
