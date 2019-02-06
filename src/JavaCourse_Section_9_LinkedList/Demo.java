package JavaCourse_Section_9_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

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


}
