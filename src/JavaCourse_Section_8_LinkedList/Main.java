package JavaCourse_Section_8_LinkedList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 54.56);

        //is just saving memory address, second class is pointing to first class

        Customer anotherCustomer = customer;

        anotherCustomer.setBalance(21.18);
        System.out.println(customer.getName() +" is "+customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        for(int i =0;i<intList.size();i++){
            System.out.println("list elements: " + intList.get(i));
        }

        intList.add(1,2);

        for(int i =0;i<intList.size();i++){
            System.out.println("list elements: " + intList.get(i));
        }


    }
}
