package JavaCourse_Section_9_ListAndArrayList;

import java.util.ArrayList;

public class GroceryList {

    private int[] myNumbers = new int[50];

    private ArrayList<String> groveryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        groveryList.add("tomato");
    }

    public void printList(){
        System.out.println("you have "+ groveryList.size());
        for(int i =0; i<groveryList.size();i++){
            System.out.println((i+1)+". "+ groveryList.get(i));
        }
    }

    public void modifyItem(int position, String newitem){
        groveryList.set(position, newitem);
        System.out.println("Grocery item " +(position+1)+" has bee modified");
    }

    public void removeItem(int position){
        String theItem = groveryList.get(position);
        groveryList.remove(position);
        System.out.println("the "+theItem+ " has been deleted");
    }

    public String findItem(String searchItem){

        //boolean exists = groveryList.contains(searchItem);
        int position = groveryList.indexOf(searchItem);
        if(position>=0){
            return groveryList.get(position);
        }
        else{
            System.out.println("No such an item");
        }
        return null;
    }
}
