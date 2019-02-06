package JavaCourse_Section_8_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Sydney");
        linkedList.add("Melbourne");
        linkedList.add("Warsaw");
        linkedList.add("Krakow");
        linkedList.add("Czecho");
        linkedList.add("Pszczyna");
        linkedList.add("Bielsko");

        printList(linkedList);

        //Linked list adds record beetwen records not moving all up/down
        
        linkedList.add(1,"Alice Springs");

        printList(linkedList);

        //Same with remove, for example Krakow-czecho-Pszczyna we will be left with Krakow-Pszczyna deleting czecho
        linkedList.remove(4);

        printList(linkedList);
    }
    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i =linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting: "+i.next());
        }
        System.out.println("=================================");

    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringIterator = linkedList.listIterator();
        while (stringIterator.hasNext()) {
            int comparison = stringIterator.next().compareTo(newCity);
            if (comparison == 0) {
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                stringIterator.previous();
                stringIterator.add(newCity);
                return true;
            } else {
                if (comparison < 0) {

                }
            }
            stringIterator.add(newCity);

        }
        return true;

    }
}
