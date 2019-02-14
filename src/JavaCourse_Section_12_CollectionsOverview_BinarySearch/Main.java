package JavaCourse_Section_12_CollectionsOverview_BinarySearch;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian",4,4);
//        theatre.getSeat();
//        if(theatre.reserveSeat("A1")){
//            System.out.println("Please pat");
//        }else{
//            System.out.println("Sit taken");
//        }
//
        List<Theatre.Seat> seatCopy = new ArrayList<theatre.seats>();
        printList(seatCopy);

 }

    public static void printList(List<Theatre.Seat> list){
            for(Theatre.Seat seat : list){
                System.out.println(" "+seat.getSeatNumber());
            }
        System.out.println();
        System.out.println("=====================================");
    }

}
